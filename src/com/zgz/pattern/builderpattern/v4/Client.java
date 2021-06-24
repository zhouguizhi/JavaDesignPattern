package com.zgz.pattern.builderpattern.v4;

/**
 * 定义一个电脑类,并给电脑类属性赋值,
 * v4版本相对v3版本是不会漏掉给某个值赋值
 */
public class Client {
    public static void main(String[] args) {
        IComputerBuilder hightComputerBuilder = new HightComputerBuilder();
        hightComputerBuilder.build();


        IComputerBuilder milldleComputerBuilder = new MilldleComputerBuilder();
        milldleComputerBuilder.build();


        IComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        lowComputerBuilder.build();
    }
}
