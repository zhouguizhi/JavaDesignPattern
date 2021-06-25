package com.zgz.pattern.templatepattern.v2;
import java.util.ArrayList;
import java.util.List;
/**
 * v2版本比v1版本好处是封装了变化的部分,其实还可以使用代理模式,或者AOP
 */
public class Client extends Template{
    public static void main(String[] args) {
        new Client().calculate();
    }
    @Override
    public void business() {
        List<Integer>  list = new ArrayList<>();
        list.add(1);
    }
}
