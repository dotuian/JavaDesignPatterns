package com.dotuian.dp2.factory.factorymethod;

public interface ExportFactory {
    
    public static String TYPE_STANDARD = "standard";
    public static String TYPE_FINANCIAL = "financial";
    
    public File factory(String type);

}
