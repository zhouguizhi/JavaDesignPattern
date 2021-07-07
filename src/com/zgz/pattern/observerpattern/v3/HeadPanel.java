package com.zgz.pattern.observerpattern.v3;

/**
 * 条型面板
 */
public class HeadPanel implements Observer {
    @Override
    public void update(Role role) {
        System.out.println(this.getClass().getSimpleName()+":"+role.getHp());
    }
}
