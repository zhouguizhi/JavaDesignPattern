package com.zgz.pattern.proxypattern.v3;
import java.util.Arrays;

public class CalcImpl implements ICalc {
    public void begin(String methodName,Object... param){
        System.out.println(methodName+"开始执行....."+ Arrays.toString(param));
    }
    public void end(int result){
        System.out.println("结束....."+result);
    }
    @Override
    public int add(int a, int b) {
        begin("add",a,b);
        int r = a+b;
        end(r);
        return r;
    }

    @Override
    public int sub(int a, int b) {
        begin("sub",a,b);
        int r = a-b;
        end(r);
        return r;
    }

    @Override
    public int mul(int a, int b) {
        begin("mul",a,b);
        int r = a*b;
        end(r);
        return r;
    }

    @Override
    public int div(int a, int b) {
        begin("div",a,b);
        int r = a/b;
        end(r);
        return r;
    }
}
