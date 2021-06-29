package com.zgz.pattern.proxypattern.v3;

/**
 *  v3：使用模版方法模式,把打印日记信息,提取二个方法到类中,
 *  优点:解决了代码重复问题 代码重用性提高
 *  缺点:
 *  3:代码急剧膨胀,核心业务代码(就是add  sub等)与非核心业务代码(日记信息)耦合在一起 就是说begin end方法还是要在每个方法中调用,这也算是代码重复了
 *  4:需求要求开方 求余等 都必须手动的去调用begin end等方法
 *  缺点还是v2版本的问题还没得到解决
 *  尤其是遇到这种需求,早上需要日记 下午又不需要日记,日记是通过时间段来控制的,这样就比较麻烦了,在现有的基础只能去通过时间来进行if else了
 */
public class Client {
    public static void main(String[] args) {
        ICalc calc = new CalcImpl();
        calc.add(3,4);
    }
}
