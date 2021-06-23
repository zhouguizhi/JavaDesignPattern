package com.zgz.pattern.simplefactory.v2;
/**
 * 简单工厂模式 （一般来说都是一个静态方法）
 */
public class FoodFactory {
    private static final int ONE = 1;
    private static final int TWO = 2;
    public static Food getFood(int tag){
        Food food = null;
        switch (tag){
            case ONE:
                food = new Hamburger();
                break;
            case TWO:
                food = new Meter();
                break;
        }
        return food;
    }
}
