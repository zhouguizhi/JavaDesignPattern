package com.zgz.designpatterns.singleton.v7;

public class Singleton {
    private static Singleton INSTANCE = new Singleton();
    private static boolean isInit = false;
    private Singleton(){
        //反射破坏单例的解决方案
        synchronized (Singleton.class){
            if(isInit){
                throw new RuntimeException("不能通过反射创建多个对象");
            }
            isInit = true;
        }
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
