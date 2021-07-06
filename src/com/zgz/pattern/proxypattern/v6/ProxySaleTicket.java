package com.zgz.pattern.proxypattern.v6;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 他是动态代理的一部分
 */
public class ProxySaleTicket implements InvocationHandler {
    private Object target;

    public ProxySaleTicket(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理类
     * @param method 代表saleTicket方法
     * @param args 代表saleTicke方法中的行参 在这里是没有参数的,所以args是空的
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("可以在执行之前做拦截");
        Object object =  method.invoke(target,args);
        System.out.println("后置增强");
        return object;
    }
}
