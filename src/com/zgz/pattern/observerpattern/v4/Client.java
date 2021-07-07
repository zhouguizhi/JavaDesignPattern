package com.zgz.pattern.observerpattern.v4;

/**
 * v4版本解决v3版本遗留的问题
 */
public class Client {
    public static void main(String[] args) {
        Role role = new Role();
        Panel panel = new Panel(role);
        BallPanel ballPanel  = new BallPanel(role);
        HeadPanel headPanel = new HeadPanel(role);

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
