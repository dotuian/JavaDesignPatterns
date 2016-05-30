package com.dotuian.dp2.bridge;

public class UrgencyType extends MessageType{

    public UrgencyType(Message message) {
        super(message);
    }
    
    public void sendMessage(String message, String toUser) {
        message.concat(" | 加急");
        this.message.send(message, toUser);
    }
}
