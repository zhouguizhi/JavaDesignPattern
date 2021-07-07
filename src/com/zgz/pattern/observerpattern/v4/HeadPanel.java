package com.zgz.pattern.observerpattern.v4;

/**
 * 条型面板
 */
public class HeadPanel implements Observer {
    private Role role;

    public HeadPanel(Role role) {
        this.role = role;
    }
    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName()+":"+role.getHp());
    }
}
