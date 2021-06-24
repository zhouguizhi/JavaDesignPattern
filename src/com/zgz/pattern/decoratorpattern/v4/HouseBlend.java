package com.zgz.pattern.decoratorpattern.v4;


public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("HouseBlend咖啡");
    }
    @Override
    public double cost() {
        return 4;
    }
}
