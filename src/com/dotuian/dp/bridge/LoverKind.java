package com.dotuian.dp.bridge;

public class LoverKind extends Kind {

    public LoverKind(Gift gift) {
        this.gift = gift;
    }
    
    @Override
    public void send() {
        System.out.print("给爱人的");
        this.gift.send();
    }

}
