package com.zgz.designpatterns.singleton.v5;
/**
 * 静态内部类实现单例,这个好处是不会有指令重排序问题
 */
public class Singleton {
    private Singleton(){}
    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }
}
