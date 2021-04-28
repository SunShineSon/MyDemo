package com.demo.redis;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {
    private static final Logger LOG = LoggerFactory.getLogger(RedisUtils.class);

    @Value("${lms.redis.ttl:3600}")
    private long ttl;

    /**
     *
     */
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * set ttl
     *
     * @param key  key
     * @param time ttl
     * @return true:success, false:fail
     */
    public boolean expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        }
        catch (Exception e) {
            // todo error coe
            return false;
        }
    }

    /**
     * get ttl
     *
     * @param key key
     * @return ttl
     */
    public long getExpire(String key) {
        try {
            return redisTemplate.getExpire(key, TimeUnit.SECONDS);
        }
        catch (Exception ex) {
            // todo error coe
            return 0;
        }
    }

    /**
     * check if key exist
     *
     * @param key key
     * @return true: exist, false: not exist
     */
    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        }
        catch (Exception e) {
            // todo error coe
            return false;
        }
    }

    /**
     * delete value
     *
     * @param keys key set
     */
    public void del(Set<String> keys) {
        if (CollectionUtils.isNotEmpty(keys)) {
            try {
                redisTemplate.delete(keys);
            }
            catch (Exception ex) {
                // todo error coe
            }
        }
    }

    /**
     * delete value
     *
     * @param key key
     */
    public void del(String key) {
        try {
            if (redisTemplate.delete(key)){

            }
            else{

            }
        }
        catch (Exception ex) {
            // todo error coe
        }
    }

    /**
     * get String
     *
     * @param key   key
     * @param clazz value class
     * @param <T>   value class
     * @return value
     */
    public <T> T get(String key, Class<T> clazz) {
        try {
            if (StringUtils.isEmpty(key) || Objects.isNull(clazz)) {
                return null;
            }
            else {
                Object obj = redisTemplate.opsForValue().get(key);
                if (Objects.nonNull(obj) && clazz.isAssignableFrom(obj.getClass())) {
                    return (T) obj;
                }
                else {
                    return null;
                }
            }
        }
        catch (Exception ex) {
            // todo error coe
            return null;
        }
    }

    /**
     * set String
     *
     * @param key   key
     * @param value value
     * @return true: success, false: fail
     */
    public boolean set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value, ttl, TimeUnit.SECONDS);
            return true;
        }
        catch (Exception e) {
            // todo error coe
            return false;
        }
    }

    /**
     * set String
     *
     * @param key   key
     * @param value value
     * @param time  ttl
     * @return true: success, false: fail
     */
    public boolean set(String key, Object value, long time) {
        try {
            if (time > 0) {
                redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            }
            else {
                set(key, value);
            }
            return true;
        }
        catch (Exception e) {
            // todo error coe
            return false;
        }
    }

    /**
     * get keys
     *
     * @param pattern key pattern
     * @return keys
     */
    public Set<String> keys(String pattern) {
        try {
            return redisTemplate.keys(pattern + "*");
        }
        catch (Exception ex) {
            // todo error coe
            return null;
        }
    }
}
