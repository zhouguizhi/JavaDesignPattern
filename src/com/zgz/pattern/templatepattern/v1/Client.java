package com.zgz.pattern.templatepattern.v1;
import java.util.ArrayList;
import java.util.List;
/**
 * v1 版本计算集合add的时间,如果下次需求变了说是要计算别的时间,那么start  end又要重新计算,那么这个时候我们就可以把这个不变的封装起来, 变化的交给子类自己去实现
 */
public class Client {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long time = end-start;
    }
}
