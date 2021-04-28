package com.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.ZoneId;
import java.util.Optional;
import java.util.TimeZone;
import java.util.function.Function;

@Configuration
public class RedisConfig {

    private static final Logger LOG = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${spring.redis.database:0}")
    private Integer sessionDatabaseIndex;

    @Value("${spring.redis.host}")
    private String hostName;

    @Value("${spring.redis.port}")
    private Integer port;

    @Value("${spring.redis.password:}")
    private String password;

    @Value("${spring.redis.lettuce.pool.max-idle:20}")
    private Integer maxIdle;

    @Value("${spring.redis.lettuce.pool.min-idle:0}")
    private Integer minIdle;

    @Value("${spring.redis.lettuce.pool.max-active:20}")
    private Integer maxActive;

    @Value("${spring.redis.lettuce.pool.max-wait:-1}")
    private Long maxWait;

    @Value("${spring.redis.timeout:60}")
    private Long timeOut;

    @Value("${spring.redis.lettuce.shutdown-timeout:100}")
    private Long shutdownTimeOut;

    @Value("${spring.redis.ssl:true}")
    private boolean enableSSL;

    @Value("${config.azure.keyvault.path}")
    private String configAzureKeyVaultPath;

    @Value("${config.azure.keyvault.redis.secret}")
    private String configAzureKeyVaultSecret;

    private static final Function<String, byte[]> READ_FILE = p -> {
        try {
            return Files.readAllBytes(Paths.get(p));
        }
        catch (Exception e) {

            return null;
        }
    };

    @Bean(value = "redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.registerModules(new JavaTimeModule(), new Jdk8Module(), new SimpleModule());
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);
        mapper.setTimeZone(TimeZone.getTimeZone(ZoneId.of("GMT+8")));
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        mapper.configure(SerializationFeature.WRITE_DATES_WITH_ZONE_ID, true);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        RedisSerializer<Object> redisSerializer = new GenericJackson2JsonRedisSerializer(mapper);
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setDefaultSerializer(redisSerializer);
        redisTemplate.setKeySerializer(redisSerializer);
        redisTemplate.setValueSerializer(redisSerializer);
        redisTemplate.setHashKeySerializer(redisSerializer);
        redisTemplate.setHashValueSerializer(redisSerializer);
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }


    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {

        RedisStandaloneConfiguration redisConfiguration = new
                RedisStandaloneConfiguration(hostName, port);
        redisConfiguration.setDatabase(sessionDatabaseIndex);
        redisConfiguration.setPassword(RedisPassword.of(parseString()));

        // pool config
        GenericObjectPoolConfig genericObjectPoolConfig =
                new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxIdle(maxIdle);
        genericObjectPoolConfig.setMinIdle(minIdle);
        genericObjectPoolConfig.setMaxTotal(maxActive);
        genericObjectPoolConfig.setMaxWaitMillis(maxWait);

        // redis client config
        LettucePoolingClientConfiguration.LettucePoolingClientConfigurationBuilder
                builder = LettucePoolingClientConfiguration.builder().
                commandTimeout(Duration.ofMillis(timeOut));

        builder.shutdownTimeout(Duration.ofMillis(shutdownTimeOut));
        builder.poolConfig(genericObjectPoolConfig);

        // enable ssl
        if (enableSSL)
            builder.useSsl();

        LettuceClientConfiguration lettuceClientConfiguration = builder.build();

        // create connection
        LettuceConnectionFactory lettuceConnectionFactory = new
                LettuceConnectionFactory(redisConfiguration, lettuceClientConfiguration);

        lettuceConnectionFactory.afterPropertiesSet();

        return lettuceConnectionFactory;
    }

    /**
     *
     *
     * @author pengqiang.li
     * @return java.lang.String
     * method parseString
     * date 2/17/2021
     */
    private String parseString() {

        String secret = configAzureKeyVaultPath == null ? null : configAzureKeyVaultPath + "/" + configAzureKeyVaultSecret;


        return Optional.ofNullable(secret).filter(StringUtils::isNotBlank).map(READ_FILE)
                .filter(ArrayUtils::isNotEmpty).map(String::new)
                .orElse(Optional.ofNullable(password).orElse(""));

    }

}
