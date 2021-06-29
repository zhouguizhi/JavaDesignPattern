package com.zgz.pattern.proxypattern.v4;
/**
 * v4:这是使用静态代理模拟购票的行为,现在我们买票几乎不会去车站进行买票了, 能提供购票的三方平台实在太多了,比如支付宝 京东  携程  拼多多等
 * 静态代理涉及到几个角色,代理对象(ThirdPlatform) 被代理的对象(User)
 *
 * 再说个场景,比如我们做Android的网络这块,早期的有Volley,现在是OkHttp,如果是老项目的话,可能二个都要用,那比较好的方式就是通过静态代理的方式
 * v5版本就是例子
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        ThirdPlatform thirdPlatform = new ThirdPlatform(user);
        thirdPlatform.saleTicket();
    }
}
