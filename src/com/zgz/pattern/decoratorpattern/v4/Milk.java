package com.zgz.pattern.decoratorpattern.v4;
public class Milk extends Condiment {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        //饮料的价格+牛奶的价格
        return beverage.cost()+0.2;
    }
    @Override
    public String getDesc() {
        return beverage.getDesc()+"加牛奶";
    }
}
