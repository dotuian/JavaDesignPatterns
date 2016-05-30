package com.dotuian.dp2.bridge;

public class App {

    public static void main(String[] args) {

        Message email = new EmailMessage();
        Message sms = new SMSMessage();

        MessageType msg1 = new UrgencyType(email);
        msg1.sendMessage("消息内容", "dotuian@....");

        MessageType msg2 = new UrgencyType(sms);
        msg2.sendMessage("消息内容", "dotuian@....");

    }

}
