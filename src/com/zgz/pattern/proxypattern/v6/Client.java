package com.zgz.pattern.proxypattern.v6;
import java.lang.reflect.Proxy;
/**
 * 描述:v6是动态代理模式的
 * 场景:还是使用v4版本的购票来说,
 */
public class Client {
    public static void main(String[] args) {
        ClassLoader classLoader = ISaleTicket.class.getClassLoader();
        //instance 才是真正的代理类
        //instance com.zgz.pattern.proxypattern.v6.User@355da254
        ISaleTicket instance = (ISaleTicket) Proxy.newProxyInstance(classLoader, new Class[]{ISaleTicket.class}, new ProxySaleTicket(new User()));
        System.out.println("instance:="+instance);
        instance.saleTicket();
    }
}
