package com.dotuian.dp.command;

import java.util.ArrayList;
import java.util.List;

public class Boy {

    List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }
}
