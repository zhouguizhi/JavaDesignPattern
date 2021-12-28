package com.zgz.pattern.strategypattern.v4;
/**
 * 定义接口,在策略模式中,不是有一个概念叫:定义了算法簇，分别封装起来，让他们之间可以互相替换
 * 如果都是不同的方法, 怎么替换
 */
public interface Payment {
    void pay(int price);
}
