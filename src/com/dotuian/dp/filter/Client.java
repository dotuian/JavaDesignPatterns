package com.dotuian.dp.filter;

public class Client {

    /**
     * 类似于Servlert中的过滤器
     * 
     * @param args
     */
    public static void main(String[] args) {

        String str = ":) <script>alert()</script>";

        FilterChain chain = new FilterChain();
        chain.addFilter(new HtmlFilter());
        chain.addFilter(new FaceFilter());

        String result = chain.doFilter(str);
        System.out.println(result);

    }

}
