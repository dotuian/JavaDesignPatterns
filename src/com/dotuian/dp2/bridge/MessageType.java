package com.dotuian.dp2.bridge;

public abstract class MessageType {

    protected Message message;

    public MessageType(Message message) {
        this.message = message;
    }

    public void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }

}
