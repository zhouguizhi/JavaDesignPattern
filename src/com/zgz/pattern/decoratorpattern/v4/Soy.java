package com.zgz.pattern.decoratorpattern.v4;

public class Soy extends Condiment {
    public Soy(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        //饮料的价格+豆浆的价格
        return beverage.cost()+0.5;
    }
    @Override
    public String getDesc() {
        return beverage.getDesc()+"豆浆";
    }
}
