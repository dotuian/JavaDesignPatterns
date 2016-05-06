package com.dotuian.dp.command;

public class WashingCommand implements Command {

    @Override
    public void execute() {
        System.out.println("washing command");
    }

}
