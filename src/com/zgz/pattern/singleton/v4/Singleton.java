package com.zgz.pattern.singleton.v4;
/**
 * 双重检查锁方式
 */
public class Singleton {
    private Singleton(){}
    //volatile 保证可见性和有序性 如果不使用volatile 可能会由于JVM重排序问题,导致对象为null
    private volatile  static Singleton instance = null;
    public static Singleton getInstance(){
        if(null==instance){
            synchronized (Singleton.class){
                if(null==instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
