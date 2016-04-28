package com.dotuian.dp.bridge;

public class FriendKind extends Kind {

    public FriendKind(Gift gift) {
        this.gift = gift;
    }

    @Override
    public void send() {
        System.out.print("给普通朋友");
        this.gift.send();
    }

}
