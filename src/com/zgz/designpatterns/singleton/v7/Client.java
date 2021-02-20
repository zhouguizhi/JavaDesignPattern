package com.zgz.designpatterns.singleton.v7;
import java.lang.reflect.Constructor;
/**
 * 利用反射破坏单例
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Class clazz = Singleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = (Singleton) constructor.newInstance();
        Singleton singleton2 = (Singleton) constructor.newInstance();
        System.out.println(singleton1==singleton2);
    }
}
