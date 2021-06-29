package com.zgz.pattern.proxypattern.v4;
/**
 * 这是真正的对象,也是被代理的对象,
 */
public class User implements ISaleTicket {
    @Override
    public void saleTicket() {
        System.out.println("我需要购买去鄱阳的高铁票");
    }
}
