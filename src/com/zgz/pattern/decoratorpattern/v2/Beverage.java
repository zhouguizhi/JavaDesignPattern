package com.zgz.pattern.decoratorpattern.v2;

public abstract class Beverage {
    private String desc;

    public Beverage(String desc) {
        this.desc = desc;
    }
    //价格
    public abstract double cost();

    public String getDesc() {
        return desc;
    }
}
