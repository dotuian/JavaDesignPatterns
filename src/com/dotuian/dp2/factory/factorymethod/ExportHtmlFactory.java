package com.dotuian.dp2.factory.factorymethod;

public class ExportHtmlFactory implements ExportFactory {

    @Override
    public File factory(String type) {

        if (ExportFactory.TYPE_STANDARD.equals(type)) {
            return new StandardHtmlFile();

        } else if (ExportFactory.TYPE_FINANCIAL.equals(type)) {
            return new FinancialHtmlFile();

        } else {

            throw new RuntimeException("没有指定的类型！");
        }
    }

}
