package com.zgz.pattern.decoratorpattern.v1;
/**
 * 业务场景:星巴克卖咖啡,因为所有咖啡都有共性,一开始只有四种,Decaf,Espresso,DarkRoast,HouseBlend因为有共性,按照java一般会提出来一个父类
 * Beverage
 * 如果现在咖啡想加入牛奶 摩卡 等怎么应对这种变化呢? 软件最难的地方是在与维护,老变需求会弄死程序员的
 */
public class Client {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
    }
}
