package com.zgz.pattern.prototypepattern.v1;
import java.util.Date;
/**
 * 原型设计模式
 * 以写周报为例,周报其实很多东西都是一样的,所以如果能拷贝就快了, 节省了很多时间,
 * 从下面的代码中我们发现就是id变了,但是name,content,date我们还要重新去set值,比较麻烦,如果周报属性很多的话,也是很耗时的一个操作
 * 所以我们就想到了拷贝,在java中要实现拷贝的话,要
 */
public class Client {
    public static void main(String[] args) {
        //第一周
        Report report = new Report();
        report.setId(1);
        report.setName("周桂枝");
        report.setContent("本事没事,自己学习");
        report.setPublishDate(new Date());
        //第二周
        Report report2 = new Report();
        report2.setId(2);
        report2.setName("周桂枝");
        report2.setContent("本事没事,自己学习");
        report2.setPublishDate(new Date());
        //第三周
        Report report3 = new Report();
        report3.setId(3);
        report3.setName("周桂枝");
        report3.setContent("本事没事,自己学习");
        report3.setPublishDate(new Date());
    }
}
