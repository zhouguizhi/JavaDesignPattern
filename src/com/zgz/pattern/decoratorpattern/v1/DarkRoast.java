package com.zgz.pattern.decoratorpattern.v1;

public class DarkRoast  extends Beverage {
    public DarkRoast() {
        super("DarkRoast咖啡");
    }
    @Override
    public double cost() {
        return 3;
    }
}
