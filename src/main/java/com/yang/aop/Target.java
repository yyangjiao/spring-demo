package com.yang.aop;

//目标类
public class Target implements TargetInterface{
    public void func() {
        System.out.println("Target.func()...");
        System.out.println(1/0);
    }
}
