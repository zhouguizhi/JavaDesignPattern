package com.zgz.pattern.simplefactory.v2;
/**
 * v2版本就是为了解决v1版本的问题,怎么解决的呢?使用了工厂模式,因为工厂模式也是别人写的,而不是调用方写的,所以不用关心其变化
 * 使用工厂模式的好处就是上层和调用层直接隔离开了, 它不关心对象是怎么创建的,屏蔽了对象创建的细节,
 */
public class Client {
    public static void main(String[] args) {
        //
        Food food = FoodFactory.getFood(1);
        food.eat();
    }
}
