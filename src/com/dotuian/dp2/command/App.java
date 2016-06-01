package com.dotuian.dp2.command;

public class App {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        Command playCommand = new PlayCommand(player);
        Command stopCommand = new StopCommand(player);
        Command rewindCommand = new RewindCommand(player);

        KeyPad keypad = new KeyPad(playCommand, stopCommand, rewindCommand);

        keypad.play();
        keypad.stop();

    }

}
