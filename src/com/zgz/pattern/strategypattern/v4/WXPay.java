package com.zgz.pattern.strategypattern.v4;
/**
 *  微信支付
 */
public class WXPay implements Payment{
    @Override
    public void pay(int price) {
        System.out.println("微信支付");
    }
}
