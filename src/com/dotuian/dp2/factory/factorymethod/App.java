package com.dotuian.dp2.factory.factorymethod;

public class App {

    public static void main(String[] args) {
        String DATA = "DATA=====";

        ExportFactory factory = null;
        File file = null;

        factory = new ExportHtmlFactory();
//        factory = new ExportPdfFactory();
        
        file = factory.factory(ExportFactory.TYPE_STANDARD);
        file.export(DATA);

        file = factory.factory(ExportFactory.TYPE_FINANCIAL);
        file.export(DATA);

    }

}
