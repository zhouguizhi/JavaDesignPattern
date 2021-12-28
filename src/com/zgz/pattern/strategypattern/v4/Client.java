package com.zgz.pattern.strategypattern.v4;
public class Client {
    public static void main(String[] args) {
//        PayLogic payLogic = new PayLogic();
//        payLogic.pay(1);

        //使用策略模式下的好处
        Payment payment = new WXPay();
        ShopCart shopCart = new ShopCart(payment);
        shopCart.pay(100);

        //如果新增了一个需求说要使用银联支付,那我们不要去修改已经写好的代码,直接写个类去实现Payment接口就好
        //这样就做到了 对修改关闭,对扩展关闭 减少版本迭代发生的bug, 增加了app的稳定性

        Payment yinLianPay = new YinLianPay();
        shopCart = new ShopCart(yinLianPay);
        shopCart.pay(20);
    }
}
