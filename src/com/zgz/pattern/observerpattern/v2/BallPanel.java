package com.zgz.pattern.observerpattern.v2;
/**
 * 球型面板
 */
public class BallPanel implements Observer{
    @Override
    public void update(int hp) {
        System.out.println(this.getClass().getSimpleName()+":"+hp);
    }
}
