package com.zgz.pattern.proxypattern.v2;

public class CalcImpl implements ICalc {
    @Override
    public int add(int a, int b) {
        System.out.println("开始.....");
        int r = a+b;
        System.out.println("结束.....");
        return r;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("开始.....");
        int r = a-b;
        System.out.println("结束.....");
        return r;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("开始.....");
        int r = a*b;
        System.out.println("结束.....");
        return r;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("开始.....");
        int r = a/b;
        System.out.println("结束.....");
        return r;
    }
}
