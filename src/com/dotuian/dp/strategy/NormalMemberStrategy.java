package com.dotuian.dp.strategy;

public class NormalMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("普通会员没有折扣！");
        return price;
    }

}
