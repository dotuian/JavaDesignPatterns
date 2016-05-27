package com.dotuian.dp.strategy;

public class SilverMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("银牌会员10%折扣！");
        return price * 0.9;
    }

}
