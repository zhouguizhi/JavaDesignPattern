package com.zgz.pattern.observerpattern.v4;

/**
 * 面板
 */
public class Panel implements Observer {
    private Role role;

    public Panel(Role role) {
        this.role = role;
    }
    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName()+":"+role.getHp());
    }
}
