package com.dotuian.dp.strategy;

public class App {

    public static void main(String[] args) {
        MemberStrategy[] strategys = new MemberStrategy[]{
                new NormalMemberStrategy(), 
                new SilverMemberStrategy(),
                new GoldenMemberStrategy()
        };
        
        for(MemberStrategy strategy : strategys) {
            double amount = 100.0d;
            Price price = new Price(strategy, amount);
            System.out.println(price.calcPrice());
        }

    }
}
