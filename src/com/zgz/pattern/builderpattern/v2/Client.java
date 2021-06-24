package com.zgz.pattern.builderpattern.v2;
/**
 * 定义一个电脑类,并给电脑类属性赋值,
 * v2版本比v1版本是隐藏了Computer创建的细节,也就是说给Computer属性赋值对上层(Client类)是不可见的
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.build();
    }
}
