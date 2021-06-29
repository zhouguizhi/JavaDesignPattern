package com.zgz.pattern.strategypattern.v2;
/**
 * v2版本:游戏公司的老总开会,提出一个提高公司竞争力的方案,要求让游戏中的鸭子能飞起来,把其他竞争者远远摔在身后,这是新的需求
 * 程序员思考:这还不简单呢?我只需要在父类中Duck中添加一个fly方法即可,那么Duck的子类都具有fly方法了
 * 缺点:如果在父类中添加了fly方法,那么所有的子类都有了fly方法,关键是不是所有的鸭子都会飞啊,比如橡皮鸭子,如果让橡皮鸭也能飞的话,你离找工作不远了,
 * 如果是在父类中Duck添加了fly方法,那么橡皮鸭子只能在fly中做特殊处理 不让它飞了
 * 随着业务需求不断的增加,比如添加一个鸭子超人 木头鸭子,那么我这个系统就不能满足了,比如有的鸭子不能叫 飞 啥的,
 * 我们希望那些不会飞的鸭子 压根不要有fly方法,但是呢,fly方法又是在父类中,所以就要从父类中把和这个fly方法移除,分成接口,Flyable
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
    }
}
