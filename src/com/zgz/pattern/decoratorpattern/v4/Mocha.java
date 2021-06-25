package com.zgz.pattern.decoratorpattern.v4;

public class Mocha extends Condiment {
    public Mocha(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        //饮料的价格+牛奶的价格
        return beverage.cost()+0.7;
    }
    @Override
    public String getDesc() {
        return beverage.getDesc()+"摩卡";
    }
}
