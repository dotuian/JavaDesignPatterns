package com.dotuian.dp.filter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FaceFilter implements Filter {

    private static Map<String, String> maps = new HashMap<String, String>();

    static {
        maps.put(":)", "哈哈");
    }

    @Override
    public String doFilter(String str) {

        Iterator iterator = maps.keySet().iterator();

        while (iterator.hasNext()) {
            String key = String.valueOf(iterator.next());
            String value = maps.get(key);
            str = str.replace(key, value);
        }

        return str;
    }

}
