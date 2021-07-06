package com.zgz.pattern.prototypepattern.v2;
import java.util.Date;
/**
 * v2:使用浅拷贝实现v1 版本的缺点,就是要给相同属性的值赋值
 *  在java中要实现拷贝使用类实现接口Cloneable 然后实现Object中的clone方法就可以了
 *  浅拷贝 如果属性是类类型的话, 比如Report中的publishDate变量是Date类型,如果拷贝后改变它的值,那么原来的值也会跟着改变
 *  说明这个类类型变量是共享一份内存的值,如果想要类类型变量修改后原对象的保持不对,那么就要用到深拷贝了
 */
public class Client {
    public static void main(String[] args) {
        //第一周
        Report report = new Report();
        report.setId(1);
        report.setName("周桂枝");
        report.setContent("本事没事,自己学习");
        report.setPublishDate(new Date());

        try {
            Report report2 = (Report) report.clone();
            report2.setId(2);
            report2.getPublishDate().setTime(0);
            System.out.println(report);
            System.out.println(report2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
