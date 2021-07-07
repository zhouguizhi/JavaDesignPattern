package com.zgz.pattern.observerpattern.v3;

/**
 * 球型面板
 */
public class BallPanel implements Observer {
    @Override
    public void update(Role role) {
        System.out.println(this.getClass().getSimpleName()+":"+role.getHp());
    }
}
