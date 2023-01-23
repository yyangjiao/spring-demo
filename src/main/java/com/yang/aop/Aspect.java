package com.yang.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {
    public void before(){
        System.out.println("befor...");
    }
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("前置增强...");
        point.proceed();
        System.out.println("后置增强...");
    }
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }
    public void after(){
        System.out.println("最终异常");
    }
}
