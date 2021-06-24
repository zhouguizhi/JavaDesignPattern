package com.zgz.pattern.builderpattern.v1;
/**
 * 定义一个电脑类,并给电脑类属性赋值,
 * v1版本不要建造者设计模式看会有啥不好的地方
 * 这样做的缺点:
 * 客户端程序员,在实例化对象之后,必须为该对象的每一个属性进行赋值,这样对客户端程序员太麻烦了,违反了迪米特原则(最少知道原则)
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu("i7");
        computer.setGpu("i7");
        computer.setHd("1T");
        computer.setMemery("16G");
    }
}
