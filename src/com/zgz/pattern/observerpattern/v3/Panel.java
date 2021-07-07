package com.zgz.pattern.observerpattern.v3;

/**
 * 面板
 */
public class Panel implements Observer {
    @Override
    public void update(Role role) {
        System.out.println(this.getClass().getSimpleName()+":"+role.getHp());
    }
}
