package com.zgz.pattern.observerpattern.v4;

public class Monster {
    public void attack(Role role){
        if(null==role){
            return;
        }
        role.setHp(role.getHp()-10);
    }
}
