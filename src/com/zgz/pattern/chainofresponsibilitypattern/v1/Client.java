package com.zgz.pattern.chainofresponsibilitypattern.v1;
/**
 * 第一个对象要持有第二个对象
 */
public class Client {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
}
