package com.kaishengit.aop;

/**
 * @author zhao
 */
public class AopAspect {

    public void beforeAdvice() {
        System.out.println("before...");
    }

    public void afterReturning(int count) {
        System.out.println("afterReturning..." + count);
    }

    public void throwing(Exception ex) {
        System.out.println("exception..." + ex.getMessage());
    }

    public void after() {
        System.out.println("after...");
    }



}
