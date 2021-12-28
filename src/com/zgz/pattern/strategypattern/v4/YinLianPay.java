package com.zgz.pattern.strategypattern.v4;

public class YinLianPay implements Payment {
    @Override
    public void pay(int price) {
        System.out.println("银联支付");
    }
}
