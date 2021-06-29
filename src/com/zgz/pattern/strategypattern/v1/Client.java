package com.zgz.pattern.strategypattern.v1;
/**
 * 场景:有一家游戏公司,制作一款鸭子游戏,在这个鸭子游戏中,角色都是鸭子,不同的鸭子之间有共性,所以为了提高代码的复用性,开发人员就制作了一个父类,Duck
 * 把鸭子的共性上提到这个类中
 */
public class Client {
    public static void main(String[] args) {
       Duck duck = new RedDuck();
       duck.display();
    }
}
