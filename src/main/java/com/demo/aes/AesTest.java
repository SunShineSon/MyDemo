package com.demo.aes;


import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;

/**
 * @Author : Ada
 * @CreateTime : 11/29/2019 10:37 AM
 * @Description :
 **/
public class AesTest {

    public static void main(String[] arg) {
        try {
            String middleKey = "ndc";  //就是所谓的密钥，加密和解密双方都需要
            String password = "this is password";    //需要被加密的内容

            // 生成KEY
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

            SecureRandom secureRandom = new SecureRandom();
            secureRandom.setSeed(middleKey.getBytes());
            keyGenerator.init(128, secureRandom);

            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            Key key = new SecretKeySpec(byteKey, "AES");
            System.out.println("私匙：" + key.getEncoded());

            // 加密
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] result = cipher.doFinal(password.getBytes());
            String encodeResult = Hex.encodeHexString(result);
            System.out.println("加密后：" + encodeResult);

            // 解密
            byte[] encodePassword = Hex.decodeHex(encodeResult.toCharArray());
            cipher.init(Cipher.DECRYPT_MODE, key);
            result = cipher.doFinal(encodePassword);
            System.out.println("解密后：" + new String(result));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
