package com.dotuian.dp2.bridge;

public class CommonType extends MessageType {

    public CommonType(Message message) {
        super(message);
    }

    public void sendMessage(String message, String toUser) {
        message.concat(" | 普通");
        this.message.send(message, toUser);
    }

}
