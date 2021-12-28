package com.zgz.pattern.strategypattern.v4;

/**
 * 银行卡支付
 */
public class BankPay implements Payment {
    @Override
    public void pay(int price) {
        System.out.println("银行卡支付");
    }
}
