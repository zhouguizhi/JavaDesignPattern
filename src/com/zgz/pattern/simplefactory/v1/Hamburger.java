package com.zgz.pattern.simplefactory.v1;
//具体产品
public class Hamburger implements Food {
    @Override
    public void eat() {
        System.out.println("吃汉堡");
    }
}
