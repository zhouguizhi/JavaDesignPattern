package com.zgz.pattern.strategypattern.v3;

public abstract class Duck {
//    public void quack(){
//        System.out.println("嘎嘎");
//    }
    public void swim(){
        System.out.println("游泳");
    }
//    public void fly(){
//        System.out.println("我飞!!!");
//    }
    //外观
    public abstract void display();
}
