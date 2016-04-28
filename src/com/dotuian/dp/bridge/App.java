package com.dotuian.dp.bridge;

public class App {

    public static void main(String[] args) {

        Gift flower = new Flower();
        Gift bag = new Bag();

        // 给父母的鲜花
        Kind parentFlower = new ParentKind(flower);
        parentFlower.send();

        // 给朋友的鲜花
        Kind friendFlower = new FriendKind(flower);
        friendFlower.send();

        // 给爱人的鲜花
        Kind loverFlower = new LoverKind(flower);
        loverFlower.send();

        System.out.println("======================");

        // 给父母的包包
        Kind parentBag = new ParentKind(bag);
        parentBag.send();

        // 给朋友的包包
        Kind friendBag = new FriendKind(bag);
        friendBag.send();

        // 给爱人的包包
        Kind loverBag = new LoverKind(bag);
        loverBag.send();

    }

}
