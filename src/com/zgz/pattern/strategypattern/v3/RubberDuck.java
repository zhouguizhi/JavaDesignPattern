package com.zgz.pattern.strategypattern.v3;

/**
 * 橡皮鸭子
 */
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }

//    @Override
//    public void quack() {
//        System.out.println("吱吱叫!!!");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("橡皮鸭不能飞!!!");
//        throw new RuntimeException("you can you up");
//    }
}
