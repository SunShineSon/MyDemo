package com.demo.aes;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.security.Key;
import java.security.SecureRandom;


/**
 * @Author : Ada
 * @CreateTime : 11/29/2019 10:40 AM
 * @Description :
 **/
public class AesUtil {

    private final String MiddleKey = "AFA0511C134699AC9D6AC98BBF9562255D2EB8CC0A6735B0FC1E2BADA59583F4";      //生成key需要的密码

    private static String ivParameter = "6993324250ADCA96514EE78B1EC5F499"; // 密钥默认偏移，可更改
    private static byte[] iv = ivParameter.getBytes();

    public String encrypt(String password) {
        try {
            // 加密
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, getKey());
            byte[] result = cipher.doFinal(password.getBytes());
            // return Hex.encodeHexString(result);
            return Base64.encodeBase64String(result);//通过Base64转码返回
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /*
     * encryptedPassword:待解密的密文
     */
    public String decrypt(String encryptedPassword) {
        try {
            // 解密
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, getKey());
            // byte[] result = cipher.doFinal(encryptedPassword.getBytes());
            byte[] result = cipher.doFinal(Base64.decodeBase64(encryptedPassword));
            return new String(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private Key key;

    public Key getKey() {
        if (key == null) {
            try {
                // 生成KEY,AES要求密钥长度为 128
                KeyGenerator generator = KeyGenerator.getInstance("AES");

                SecureRandom random = new SecureRandom();
                random.setSeed(MiddleKey.getBytes());
                generator.init(128, random);
                SecretKey secretKey = generator.generateKey();
                byte[] byteKey = secretKey.getEncoded();

                // 转换KEY
                key = new SecretKeySpec(byteKey, "AES");
                return key;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return key;
        }
    }


    public static void main(String[] args) {
        AesUtil util = new AesUtil();
        String encryptedPassword = util.encrypt("Ada.guoguanlan");
        System.out.println(encryptedPassword);  //QmwiWJd+3YC6FT+dvBOadA==
        String password = util.decrypt(encryptedPassword);
        System.out.println(password);

    }

}
