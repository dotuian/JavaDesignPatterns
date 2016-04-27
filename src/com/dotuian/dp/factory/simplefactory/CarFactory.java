package com.dotuian.dp.factory.simplefactory;

public class CarFactory {

    public static Car create(String brand) {

        Car car = null;

        switch (brand.toLowerCase()) {
        case "toyota":
            car = new ToyotaCar();
            break;
        case "honda":
            car = new HondaCar();
            break;

        default:
            break;
        }

        return car;
    }

}
