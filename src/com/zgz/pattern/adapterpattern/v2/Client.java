package com.zgz.pattern.adapterpattern.v2;
/**
 * v2:使用适配器解决v1 版本的问题
 */
public class Client {
    public static void main(String[] args) {
        FooAdapter fooAdapter = new FooAdapter(new Foo());
        fooAdapter.add(1,3);
    }
}
