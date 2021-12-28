package com.zgz.pattern.strategypattern.v4;
/**
 * 购物车
 */
public class ShopCart {
    private Payment payment;

    public ShopCart(Payment payment) {
        this.payment = payment;
    }
    public void pay(int price){
        payment.pay(price);
    }
}
