package com.zgz.pattern.adapterpattern.v1;
/**
 * 适配器模式
 * Foo类中定义了三个int相加, 但是现在需求变了,要求求二个int的和,难道我们要去改Foo类的代码,第一违背了开闭原则,第二如果以后要求三个数相加,
 * 这个功能也没有了,破坏了以前的功能，请看v2版本
 */
public class Client {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.add(1,3,4);
    }
}
