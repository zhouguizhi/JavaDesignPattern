package com.zgz.pattern.decoratorpattern.v4;
/**
 * 针对v3版本我们要引入装饰器模式
 */
public class Client {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        Milk milk = new Milk(decaf);
        double cost = milk.cost();
        System.out.println("cost:="+cost);
        System.out.println("desc:="+milk.getDesc());

        Mocha mocha = new Mocha(milk);

        System.out.println("摩卡的价格:="+mocha.cost());
        System.out.println("摩卡的描述:="+mocha.getDesc());
    }
}
