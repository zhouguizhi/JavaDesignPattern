package com.zgz.pattern.proxypattern.v2;

/**
 *  v2：在CalcImpl类中,已经在四个方法中添加了日记信息了,但是这会带来缺点
 *  缺点
 *  1：代码在重复,重复的代码就是System.out.println("开始.....");   System.out.println("结束.....");
 *  2:如果需求有变化,要求使用英文输出日记,那么只能改代码了,这样违背了开闭原则
 *  3:代码急剧膨胀,核心业务代码(就是add  sub等)与非核心业务代码(日记信息)耦合在一起
 *  4:需求要求开方 求余等
 */
public class Client {
    public static void main(String[] args) {
        ICalc calc = new CalcImpl();
        calc.add(3,4);
    }
}
