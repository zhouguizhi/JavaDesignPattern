package com.zgz.designpatterns.singleton.v6;
/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Singleton s1 =  Singleton.INSTANCE;
        Singleton s2 =  Singleton.INSTANCE;
        System.out.println(s1==s2);
    }
}
