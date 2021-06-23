package com.zgz.pattern.simplefactory.v2;

public class Meter implements Food {
    @Override
    public void eat() {
        System.out.println("吃米");
    }
}
