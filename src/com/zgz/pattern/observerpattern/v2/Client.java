package com.zgz.pattern.observerpattern.v2;
/**
 * 使用观察者模式解决v1版本的问题
 * 但是这也会有个问题,比如游戏是经常需要变化的,比如装备 造血能力啊,这就要去Role类中添加属性了,那么update就需要变化了,现在要求就是
 * 如果在Role类中添加属性,update方法不需要改动,看v3版本
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
