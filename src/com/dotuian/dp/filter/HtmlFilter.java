package com.dotuian.dp.filter;

import java.util.HashMap;
import java.util.Map;

public class HtmlFilter implements Filter {

    private static Map<Character, String> maps = new HashMap<Character, String>();

    static {
        maps.put('<', "&lt");
        maps.put('>', "&gt");
    }

    @Override
    public String doFilter(String str) {
        if (str == null) {
            return null;
        }

        String result = "";
        for (char c : str.toCharArray()) {
            String value = maps.get(c);
            if (value == null) {
                value = String.valueOf(c);
            }
            result += value;
        }

        return result;
    }

}
