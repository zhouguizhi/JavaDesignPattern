package com.zgz.pattern.decoratorpattern.v3;

public class DarkRoast  extends Beverage {
    public DarkRoast() {
        super("DarkRoast咖啡");
    }
    @Override
    public double cost() {
        return 3+super.cost();
    }
}
