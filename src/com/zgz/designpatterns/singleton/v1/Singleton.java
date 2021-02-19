package com.zgz.designpatterns.singleton.v1;
/**
 *  饿汉式方式实现单例:优点:没有线程安全问题,缺点是如果该类用不到会浪费内存
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
