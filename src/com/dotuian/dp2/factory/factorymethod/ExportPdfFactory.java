package com.dotuian.dp2.factory.factorymethod;

public class ExportPdfFactory implements ExportFactory {

    @Override
    public File factory(String type) {

        if (ExportFactory.TYPE_STANDARD.equals(type)) {
            return new StandardPdfFile();

        } else if (ExportFactory.TYPE_FINANCIAL.equals(type)) {
            return new FinancialPdfFile();

        } else {

            throw new RuntimeException("没有指定的类型！");
        }
        
    }

}
