package com.dotuian.dp2.factory.simplefactory;

public class LoginManager {

    public static Login factory(String type) {

        if (type.equals("password")) {
            return new PasswordLogin();
        } else if (type.equals("domain")) {
            return new DomainLogin();
        } else {
            throw new RuntimeException("没有指定的类型！");
        }

    }

}
