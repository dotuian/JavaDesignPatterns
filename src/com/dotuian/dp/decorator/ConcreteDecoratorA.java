package com.dotuian.dp.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 写相关的业务代码
        // TODO
    }

}
