package com.zgz.pattern.strategypattern.v1;

public abstract class Duck {
    public void quack(){
        System.out.println("嘎嘎");
    }
    public void swim(){
        System.out.println("游泳");
    }
    //外观
    public abstract void display();
}
