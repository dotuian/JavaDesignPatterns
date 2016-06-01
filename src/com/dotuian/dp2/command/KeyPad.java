package com.dotuian.dp2.command;

public class KeyPad {

    private Command playCommand;
    private Command stopCommand;
    private Command rewindCommand;

    public KeyPad() {
    }

    public KeyPad(Command playCommand, Command stopCommand, Command rewindCommand) {
        this.playCommand = playCommand;
        this.stopCommand = stopCommand;
        this.rewindCommand = rewindCommand;
    }

    public void play() {
        this.playCommand.execute();
    }

    public void rewind() {
        this.rewindCommand.execute();
    }

    public void stop() {
        this.stopCommand.execute();
    }

    public Command getPlayCommand() {
        return playCommand;
    }

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public Command getStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public Command getRewindCommand() {
        return rewindCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

}
