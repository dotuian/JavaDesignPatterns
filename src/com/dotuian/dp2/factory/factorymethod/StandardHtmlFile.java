package com.dotuian.dp2.factory.factorymethod;

public class StandardHtmlFile implements File {

    @Override
    public boolean export(String data) {
        System.out.println("标准HTML文件 " + data);
        return false;
    }

}
