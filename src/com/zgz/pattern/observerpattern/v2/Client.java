package com.zgz.pattern.observerpattern.v2;
/**
 * 使用观察者模式解决v1版本的问题
 */
public class Client {
    public static void main(String[] args) {
        Panel panel = new Panel();
        BallPanel ballPanel  = new BallPanel();
        HeadPanel headPanel = new HeadPanel();
        Role role = new Role();
        role.setName("古天乐");
        role.setHp(100);
        role.setMp(100);
        role.addObserver(panel);
        role.addObserver(ballPanel);
        role.addObserver(headPanel);

        Monster monster = new Monster();
        monster.attack(role);
    }
}
