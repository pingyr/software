package com.pingyrsoft.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5Util {


    public String encrypted(String arg){
        return digest(arg);
    }

    public String encrypted(long arg){
        return digest(String.valueOf(arg));
    }

    private String digest(String arg){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String letter = "pingyr";
            messageDigest.update((arg+ letter).getBytes());
            return new BigInteger(1,messageDigest.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("MD5加密失败!");
        }
    }

}
