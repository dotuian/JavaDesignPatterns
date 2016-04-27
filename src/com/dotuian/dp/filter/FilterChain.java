package com.dotuian.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<Filter>();

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    @Override
    public String doFilter(String str) {
        String temp = str;

        for (Filter filter : this.filters) {
            temp = filter.doFilter(temp);
        }

        return temp;
    }

}
