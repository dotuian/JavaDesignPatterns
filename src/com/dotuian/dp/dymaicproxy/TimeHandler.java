package com.dotuian.dp.dymaicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(new Date().toString());

        method.invoke(this.target, args);

        System.out.println(new Date().toString());
        return null;
    }

}
