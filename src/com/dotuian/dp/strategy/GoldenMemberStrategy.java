package com.dotuian.dp.strategy;

public class GoldenMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("金牌会员20%折扣！");
        return price * 0.8;
    }

}
