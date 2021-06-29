package com.zgz.pattern.strategypattern.v3;

public class MallardDuck extends Duck implements Flyable,Quackable {
    @Override
    public void display() {
        System.out.println("外观是野鸭!!");
    }

    @Override
    public void fly() {
        System.out.println("会飞的鸭子!!");
    }
    @Override
    public void quack() {
        System.out.println("会叫的鸭子!!");
    }
}
