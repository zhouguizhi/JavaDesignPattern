package com.zgz.designprinciples.interfacesegregationprinciple;

public class Client {
    public static void main(String[] args) {
        IFly fly = new Bird();
        fly.fly();
        IClimb climb = new Tortoise();
        climb.climb();
    }
}
