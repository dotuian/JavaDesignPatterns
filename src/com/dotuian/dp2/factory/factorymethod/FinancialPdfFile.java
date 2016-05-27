package com.dotuian.dp2.factory.factorymethod;

public class FinancialPdfFile implements File {

    @Override
    public boolean export(String data) {
        System.out.println("财务PDF文件 " + data);
        return false;
    }

}
