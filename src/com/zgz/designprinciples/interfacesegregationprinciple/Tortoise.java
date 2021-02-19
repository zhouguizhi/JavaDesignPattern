package com.zgz.designprinciples.interfacesegregationprinciple;

public class Tortoise implements IClimb {
    @Override
    public void climb() {
        System.out.println("乌龟在地上上爬");
    }
}
