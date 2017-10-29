package com.kaishengit.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhao
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try {
            System.out.println("before ...");
            result = methodProxy.invokeSuper(o, objects);
            System.out.println("after ...");
        } catch (Exception ex) {
            System.out.println("exception ..." + ex.getMessage());
        }
        return result;
    }
}
