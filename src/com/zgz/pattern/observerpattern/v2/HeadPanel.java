package com.zgz.pattern.observerpattern.v2;
/**
 * 条型面板
 */
public class HeadPanel implements Observer{
    @Override
    public void update(int hp) {
        System.out.println(this.getClass().getSimpleName()+":"+hp);
    }
}
