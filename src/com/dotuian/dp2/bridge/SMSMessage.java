package com.dotuian.dp2.bridge;

public class SMSMessage implements Message {

    public void send(String message, String toUser) {
        System.out.println(String.format("SMS Message: %s %s", message, toUser));
    }

}
