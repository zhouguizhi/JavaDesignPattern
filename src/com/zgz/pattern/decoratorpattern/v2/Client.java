package com.zgz.pattern.decoratorpattern.v2;

/**
 * 业务场景:星巴克卖咖啡,因为所有咖啡都有共性,一开始只有四种,Decaf,Espresso,DarkRoast,HouseBlend因为有共性,按照java一般会提出来一个父类
 * Beverage
 * 如果现在咖啡想加入牛奶 摩卡 等怎么应对这种变化呢? 软件最难的地方是在与维护,老变需求会弄死程序员的
 * 如果要加入牛奶 摩卡啥的,我们只能每次去新建一个类,因为每个咖啡都可以加入牛奶,那么就在四个咖啡中添加四个类带牛奶的,再加四个类带摩卡的,这样如果很多的话, 会导致类太多
 * 不好维护,这样扩展性也不强
 * DecafWithMilk(牛奶),
 */
public class Client {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
    }
}
