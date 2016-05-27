package com.dotuian.dp2.state;

public class App {

    public static void main(String[] args) {
        VoteManager manager = new VoteManager();

        for (int i = 1; i <= 10; i++) {
            manager.vote("SHOUKII");
        }

    }
}
