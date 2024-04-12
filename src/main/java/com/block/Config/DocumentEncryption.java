package com.block.Config;



import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

public class DocumentEncryption {
    private static final String AES = "AES";

    public static byte[] encryptDocument(String document, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), AES);
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(document.getBytes());
    }

    public static String hashDocument(String document) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(document.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
