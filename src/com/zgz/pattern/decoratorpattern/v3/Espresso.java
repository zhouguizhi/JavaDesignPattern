package com.zgz.pattern.decoratorpattern.v3;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso咖啡");
    }

    @Override
    public double cost() {
        return 2+super.cost();
    }
}
