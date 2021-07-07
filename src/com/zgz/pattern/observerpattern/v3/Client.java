package com.zgz.pattern.observerpattern.v3;

/**
 * v3版本解决v2版本遗留的问题
 * 解决办法就是在update()方法中把Role对象传递进去,以后要获取什么角色属性直接通过Role对象去拿就行
 * 这样做的缺点:
 * 如果在update()方法中传递了Role对象的话,那么这个观察者就只能观察一种了,如果有其他要观察的对象就不能观察了,
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
