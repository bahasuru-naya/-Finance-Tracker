/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.assignment;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encryption {
    
    private static String keyString = "ThisIsAKeyForDem";//16 chracters
	

    public static String encrypt(String input) throws Exception {
        
        byte[] keyBytes = keyString.getBytes(StandardCharsets.UTF_8);
        SecretKey secretKey = new javax.crypto.spec.SecretKeySpec(keyBytes, "AES");

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);
        byte[] encryptedBytes = cipher.doFinal(inputBytes);

        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

        return encryptedText;
    }

    public static String decrypt(String encryptedInput) throws Exception {
        
        byte[] keyBytes = keyString.getBytes(StandardCharsets.UTF_8);
        SecretKey secretKey = new javax.crypto.spec.SecretKeySpec(keyBytes, "AES");

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedInput));
        String decryptedText = new String(decryptedBytes, StandardCharsets.UTF_8);

        return decryptedText;
    }
    
}
