package com.zgz.pattern.proxypattern.v1;
/**
 *  v1：需求，变化来了,要求每个方法添加日记功能,在方法开始和结束打印日记信息,目前的办法(暂不用代理模式)，那么只能在四个方法中
 *  去改代码了添加日记信息,看v2版
 */
public class Client {
    public static void main(String[] args) {
        ICalc calc = new CalcImpl();
        calc.add(3,4);
    }
}
