package com.zgz.pattern.builderpattern.v3;
/**
 * 定义一个电脑类,并给电脑类属性赋值,
 * v3版本比v2版本更好的是满足了用户一些需求,比如要求高配的电脑 中端电脑 低端电脑,但是v3版本也有个缺点就是如果构建的对象属性很多时,要创建很多个builder类
 * 这样扩展性比较差,而且会造成很多重复的代码, 比如电脑硬盘是不变的话,每次都要设置,还有就是可能会漏掉某个值忘记了赋值的情况
 */
public class Client {
    public static void main(String[] args) {
        HightComputerBuilder hightComputerBuilder = new HightComputerBuilder();
        hightComputerBuilder.build();


        MilldleComputerBuilder milldleComputerBuilder = new MilldleComputerBuilder();
        milldleComputerBuilder.build();


        LowComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        lowComputerBuilder.build();
    }
}
