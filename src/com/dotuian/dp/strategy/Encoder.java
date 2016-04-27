package com.dotuian.dp.strategy;

import java.util.HashMap;
import java.util.Map;

public abstract class Encoder {
    private Map<Character, String> conversionTable = new HashMap<Character, String>();

    protected void addConversion(char c, String s) {
        this.conversionTable.put(c, s);
    }

    protected void addNoConversion(char c) {
        this.conversionTable.put(c, String.valueOf(c));
    }
    
    protected void addNoConversion(char[] collection) {
        for(char c : collection) {
            this.addNoConversion(c);
        }
    }

    protected abstract String encode(char c);

    public String encode(String s) {
        if (s == null) {
            return null;
        }

        String result = "";
        for (char c : s.toCharArray()) {
            String t = this.conversionTable.get(c);
            if (t == null) {
                t = encode(c);
            }
            result += t;
        }

        return result;
    }

}
