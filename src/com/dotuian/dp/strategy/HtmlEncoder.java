package com.dotuian.dp.strategy;

public class HtmlEncoder extends Encoder {

    private static String ALPHAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String NUMBERICS = "0123456789";

    public HtmlEncoder() {
        this.addNoConversion(ALPHAS.toCharArray());
        this.addNoConversion(ALPHAS.toLowerCase().toCharArray());
        this.addNoConversion(NUMBERICS.toCharArray());
        
        this.addConversion('>', "&gt;");
        this.addConversion('<', "&lt;");
        this.addConversion('&', "&amp;");
        this.addConversion('"', "&quot;");
    }

    @Override
    protected String encode(char c) {
        return "&#" + (int) c + ";";
    }

}
