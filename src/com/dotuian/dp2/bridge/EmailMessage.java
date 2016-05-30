package com.dotuian.dp2.bridge;

public class EmailMessage implements Message {

    public void send(String message, String toUser) {
        System.out.println(String.format("Email Message: %s %s", message, toUser));
    }

}
