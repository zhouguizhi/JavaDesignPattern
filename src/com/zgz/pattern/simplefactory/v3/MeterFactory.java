package com.zgz.pattern.simplefactory.v3;

public class MeterFactory implements FoodFactory {
    @Override
    public Food createFood() {
        return new Meter();
    }
}
