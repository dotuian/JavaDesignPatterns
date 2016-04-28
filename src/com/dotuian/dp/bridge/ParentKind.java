package com.dotuian.dp.bridge;

public class ParentKind extends Kind {
    
    public ParentKind(Gift gift) {
        this.gift = gift;
    }
    
    @Override
    public void send() {
        System.out.print("给父母的");
        this.gift.send();
    }

}
