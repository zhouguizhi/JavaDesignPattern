package com.zgz.pattern.templatepattern.v2;

public abstract class Template {
    public void calculate(){
        long start = System.currentTimeMillis();
        business();
        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println("执行时间:="+time);
    }
    public abstract void business();
}
