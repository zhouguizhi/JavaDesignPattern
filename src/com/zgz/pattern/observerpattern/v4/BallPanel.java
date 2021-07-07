package com.zgz.pattern.observerpattern.v4;

/**
 * 球型面板
 */
public class BallPanel implements Observer {
    private Role role;

    public BallPanel(Role role) {
        this.role = role;
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName()+":"+role.getHp());
    }
}
