package com.zgz.designpatterns.singleton.v3;
/**
 * 懒汉式:实现单例 这个会有线程安全问题,如果使用同步方法实现线程安全的话,会有一定的性能问题
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance ;
    //这个在多线程的环境下会出现问题
//    public static Singleton getInstance(){
//        //比如线程1进来了 判断了if条件为true,这个时候切换到线程2了,那么线程2也判断if条件为true,然后new了一个,然后线程1再new1 个对象,这样就有2个对象了,就违背了单例设计原则
//        if(null==instance){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /**
     * 使用同步方法在多线程环境下保证创建的对象只有1个
     * @return
     */
    public static synchronized Singleton getInstance(){
        //比如线程1进来了 判断了if条件为true,这个时候切换到线程2了,那么线程2也判断if条件为true,然后new了一个,然后线程1再new1 个对象,这样就有2个对象了,就违背了单例设计原则
        if(null==instance){
            instance = new Singleton();
        }
        return instance;
    }
}
