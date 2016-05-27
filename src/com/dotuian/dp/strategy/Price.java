package com.dotuian.dp.strategy;

public class Price {

    private MemberStrategy strategy;
    private double price;

    public Price(MemberStrategy strategy, double price) {
        this.strategy = strategy;
        this.price = price;
    }

    public double calcPrice() {
        return this.strategy.calcPrice(this.price);
    }

}
