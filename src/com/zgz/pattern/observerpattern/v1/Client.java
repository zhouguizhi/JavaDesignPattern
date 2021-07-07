package com.zgz.pattern.observerpattern.v1;
/**
 * 场景:
 * 一个游戏中,有一个角色,角色有hp,mp,在游戏窗口中,有一些面板来展示该游戏角色的hp,mp
 * 变化来了:
 * 产品经理要求生成一个报表线上hp,mp柱状图
 * 如果在游戏面板中突然多了一个组件,也要线上角色的hp,mp,那么就要在以前的代码中添加新的代码,这样就违背了开闭原则,还违反了单一职责原则
 */
public class Client {
    public static void main(String[] args) {
        Role role = new Role();
        role.setName("古天乐");
        role.setHp(100);
        role.setMp(100);
        role.setHp(role.getHp()-10);
    }
}
