package com.zgz.pattern.decoratorpattern.v3;
/**
 * 业务场景:星巴克卖咖啡,因为所有咖啡都有共性,一开始只有四种,Decaf,Espresso,DarkRoast,HouseBlend因为有共性,按照java一般会提出来一个父类
 * v3版本比v2版本好的地方在于不用添加那么多类,但是也有问题就是每次要添加都要修改源代码,这违反了开闭原则,这种做法无法应对业务的变化
 * 如果咖啡的价格跟加牛奶,豆浆有关系的话,  我父类就不能就要判断了是否加牛奶 然后让子类去重新cost方法+原料的钱,那么如果加了原料的话,那么父类中的desc描述肯定
 * 也是跟着要变的啊
 * v3版本优点
 * 类没有爆炸
 * 缺点:还是缺少业务的变化,比如加入茶 枸杞呢?那么就要创建一个类Tea去继承Beverage了这符合开闭原则,但是是否加入枸杞的话,cost(),getDesc()方法都会修改
 * Beverage源代码,这就违背了开闭原则
 */
public class Client {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        //加牛奶
        decaf.setMilk(true);
        decaf.setSoy(true);
        double money = decaf.cost();
        System.out.println("money:="+money);
    }
}
