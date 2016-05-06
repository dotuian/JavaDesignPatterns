package com.dotuian.dp.command;

public class Girl {

    public void order(Boy boy) {
        Command c1 = new ShoppingCommand();
        Command c2 = new WashingCommand();

        boy.addCommand(c1);
        boy.addCommand(c2);

        boy.execute();
    }

}
