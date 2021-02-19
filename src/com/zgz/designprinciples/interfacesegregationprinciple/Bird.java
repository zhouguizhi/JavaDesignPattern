package com.zgz.designprinciples.interfacesegregationprinciple;

public class Bird implements IFly {
    @Override
    public void fly() {
        System.out.println("鸟在空中飞...");
    }
}
