package com.zgz.pattern.simplefactory.v3;

public class HamburgerFactory implements FoodFactory {
    @Override
    public Food createFood() {
        return new Hamburger();
    }
}
