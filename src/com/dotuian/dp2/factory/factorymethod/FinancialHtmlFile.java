package com.dotuian.dp2.factory.factorymethod;

public class FinancialHtmlFile implements File {

    @Override
    public boolean export(String data) {
        System.out.println("财务HTML文件  " + data);
        return false;
    }

}
