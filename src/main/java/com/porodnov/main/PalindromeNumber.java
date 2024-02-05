package com.porodnov.main;

import java.util.HashMap;
import java.util.Map;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 121;
        String strNum = Integer.toString(x);
        byte[] bytes = strNum.getBytes();
        Map<Byte, Integer> map = new HashMap<>();
        for (int i = 0; i < bytes.length; i++) {
            map.put(bytes[i], i);
        }
    }
}
