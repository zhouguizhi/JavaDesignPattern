package com.zgz.pattern.decoratorpattern.v3;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("HouseBlend咖啡");
    }
    @Override
    public double cost() {
        return 4+super.cost();
    }
}
