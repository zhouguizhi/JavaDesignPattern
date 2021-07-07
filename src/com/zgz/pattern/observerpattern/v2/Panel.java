package com.zgz.pattern.observerpattern.v2;
/**
 * 面板
 */
public class Panel implements Observer{
    @Override
    public void update(int hp) {
        System.out.println(this.getClass().getSimpleName()+":"+hp);
    }
}
