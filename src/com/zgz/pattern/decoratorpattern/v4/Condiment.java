package com.zgz.pattern.decoratorpattern.v4;
//为了装饰器模式,也让Condiment继承Beverage类
public abstract class Condiment extends Beverage{
    //让Condiment关联Beverage类
    protected Beverage beverage;
    public Condiment(Beverage beverage) {
        super("调料");
        this.beverage = beverage;
    }
}
