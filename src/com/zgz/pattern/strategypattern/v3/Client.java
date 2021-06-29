package com.zgz.pattern.strategypattern.v3;

/**
 * v3版本是针对v2版本的优化
 * 思考: 这个版本问题就解决了么,以前是,哪次
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.swim();
        ((MallardDuck) duck).fly();
        ((MallardDuck) duck).quack();
        duck.display();
    }
}
