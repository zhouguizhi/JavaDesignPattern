package com.zgz.pattern.simplefactory.v3;

/**
 * v3版本只要是针对v2版本在扩展的时候违反了开闭原则,主要是解决这个问题
 * 所以就使用了工厂方法模式
 * 工厂方法模式相比简单工厂方法模式就是在有新的需求或者叫扩展的时候方便只要新建一个工厂去生产这个产品(创建对象)就可以达到扩展而不要去修改原来的方法
 * 这样就不会违反了开闭原则
 */
public class Client {
    public static void main(String[] args) {
        //
        HamburgerFactory hf = new HamburgerFactory();
        hf.createFood().eat();
    }
}
