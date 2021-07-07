package com.zgz.pattern.adapterpattern.v2;

public class FooAdapter {
    private Foo foo;

    public FooAdapter(Foo foo) {
        this.foo = foo;
    }
    public int add(int a,int b){
        return foo.add(a,b,0);
    }
}
