package com.zgz.pattern.singleton.v2;
/**
 * 饿汉式:静态代码块的方式实现
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance = null;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
