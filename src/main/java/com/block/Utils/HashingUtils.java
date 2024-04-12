package com.block.Utils;

import org.springframework.util.DigestUtils;

public class HashingUtils {
    public static String generateHash(String content) {
        return DigestUtils.md5Hex(content);
    }
    
}

