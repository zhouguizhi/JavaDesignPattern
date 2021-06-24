package com.zgz.pattern.decoratorpattern.v4;

public class Decaf  extends Beverage {
    public Decaf() {
        super("Decaf咖啡");
    }
    @Override
    public double cost() {
        return 1;
    }
}
