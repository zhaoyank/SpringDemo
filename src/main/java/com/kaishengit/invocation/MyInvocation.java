package com.kaishengit.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhao
 */
public class MyInvocation implements InvocationHandler {
    private Object target;
    public MyInvocation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method run...");
        Object result = method.invoke(target, args);
        System.out.println("After method run...");

        return result;
    }
}
