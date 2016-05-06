package com.dotuian.dp.templatemethod;

public class JavaScriptEncoder extends Encoder {

    private static String ALPHAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String NUMBERICS = "0123456789";

    public JavaScriptEncoder() {
        this.addNoConversion(ALPHAS.toCharArray());
        this.addNoConversion(ALPHAS.toLowerCase().toCharArray());
        this.addNoConversion(NUMBERICS.toCharArray());
    }

    @Override
    protected String encode(char c) {
        if (c < 256) {
            return String.format("\\x02X", (int) c);
        }

        return String.format("\\u04X", (int) c);
    }

}
