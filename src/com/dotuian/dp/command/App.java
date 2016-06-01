package com.dotuian.dp.command;

public class App {

    public static void main(String[] args) {

        Boy boy = new Boy();
        Girl girl = new Girl();
        
        Command c1 = new ShoppingCommand();
        Command c2 = new WashingCommand();

        boy.addCommand(c1);
        boy.addCommand(c2);

        girl.order(boy);

    }

}
