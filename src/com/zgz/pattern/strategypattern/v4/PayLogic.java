package com.zgz.pattern.strategypattern.v4;
/**
 * 这么做的弊端是什么:
 * 1:不利于以后扩展, 如果以后新增加一个QQ支付,那么是不是要去修改这个类的pay()方法,
 * 凡是涉及到修改源代码的,都有可能引入其他bug, 这个对代码质量管控非常不好, 而且也违背了涉及模式的原则
 * 对实现关闭 对扩展开放,叫开闭原则
 * 2:随着公司业务的增强,以后接三方支付越来越多, 难道每次都要去修改pay(), 然后写else if()方法,记住你是
 * 一个高级工程师,这种写法太low,一定要想办法,每次新增加业务的时候,最好不要去动我们之前写好的逻辑,但是可以扩展,
 * 在java中扩展有二个,一个是抽象类,一个是接口,一般都是使用接口
 *
 * 3:我们要针对接口编程 不要针对实现编程, 针对实现编程会把代码写死,不好扩展,
 */
public class PayLogic {
    public void pay(int tag){
        if(tag==1){
            System.out.println("微信支付");
        }else if(tag==2){
            System.out.println("支付宝支付");
        }else if(tag==3){
            System.out.println("银行卡支付");
        }
    }
}
