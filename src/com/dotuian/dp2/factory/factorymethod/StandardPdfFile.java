package com.dotuian.dp2.factory.factorymethod;

public class StandardPdfFile implements File {

    @Override
    public boolean export(String data) {
        System.out.println("标准PDF文件 " + data);
        return false;
    }

}
