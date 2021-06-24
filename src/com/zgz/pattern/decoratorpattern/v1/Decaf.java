package com.zgz.pattern.decoratorpattern.v1;

public class Decaf  extends Beverage {
    public Decaf() {
        super("Decaf咖啡");
    }
//    public Decaf(String desc) {
//        super(desc);
//    }
    @Override
    public double cost() {
        return 1;
    }
}
