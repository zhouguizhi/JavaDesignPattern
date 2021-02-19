package com.zgz.designprinciples.openingclosingprinciple;
/**
 * 客户端 也就是调用层或者叫上层
 */
public class Client {
    public static void main(String[] args) {
        ChangComputerExterior changComputerExterior = new ChangComputerExterior();
        //如果想改变电脑外观的话只要新建一个类去继承ComputerSkin就可以,不要改以前的代码,这就是对扩展是开放的,对修改是关闭的,不会影响到其他的逻辑
        changComputerExterior.display(new DefaultComputerSkin());
    }
}
