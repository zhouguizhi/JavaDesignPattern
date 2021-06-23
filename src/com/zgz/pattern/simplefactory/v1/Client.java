package com.zgz.pattern.simplefactory.v1;
/**
 * v1版本不好的地方是如果有人把Hamburger的类名改了,那么上层或者叫高层模块也就是Client类的代码也要改,那么就耦合度太高了,
 * 所以最好的是不管类名改不改,对高层或者上层Client代码最好不动, 达到很好的解耦关系
 */
public class Client {
    public static void main(String[] args) {
        //多态  向上转型 如果把Hamburger类改了,那么Client代码就就报错
        Food food = new Hamburger();
        food.eat();
    }
}
