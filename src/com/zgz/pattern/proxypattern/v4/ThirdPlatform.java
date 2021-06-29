package com.zgz.pattern.proxypattern.v4;
/**
 * 三方平台,比如可以从支付宝 京东 携程都可以购买火车票,
 * 三方平台可以代理我们去购买车票, 从而不需要用户自己跑去车站进行买票的行为
 * 用java语言就是目标对象和上层不接触,使用代理对象去和上层接触,比如需要查看车票时间 或者看下其他车票,都可以使用代理对象去做
 *  从而扩展了目标对象的功能
 */
public class ThirdPlatform implements ISaleTicket{
    private User user;
    public ThirdPlatform(User user) {
        this.user = user;
    }
    @Override
    public void saleTicket() {
        //这是模拟增强被代理对象的功能
        System.out.println("去那个平台买票比较便宜");
        user.saleTicket();
        //这是模拟增强被代理对象的功能
        System.out.println("查看到站后附近有那些实惠的酒店入住");
    }
}
