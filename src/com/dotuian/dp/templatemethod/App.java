package com.dotuian.dp.templatemethod;

public class App {

    public static void main(String[] args) {

        String str = "<script>alert('哈哈')</script>";

        Encoder encoder = new HtmlEncoder();
        String result = encoder.encode(str);
        System.out.println(result);

        encoder = new JavaScriptEncoder();
        result = encoder.encode(str);
        System.out.println(result);

    }

}
