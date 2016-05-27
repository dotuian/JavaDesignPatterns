package com.dotuian.dp2.factory.abstractfactory;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        //AbstractFactory factory = new IntelFactory();
        AbstractFactory factory = new AmdFactory();
        
        Cpu cpu = factory.createCpu();
        Mainboard mainboard = factory.createMainboard();
        cpu.calculate();
        mainboard.installCPU();
        
        
    }
    
}
