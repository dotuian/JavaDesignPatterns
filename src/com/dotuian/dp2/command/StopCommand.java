package com.dotuian.dp2.command;

public class StopCommand implements Command {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        this.audioPlayer.stop();
    }

}
