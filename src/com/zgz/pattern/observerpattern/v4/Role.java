package com.zgz.pattern.observerpattern.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色
 */
public class Role {
    private String name;
    private Integer hp;
    private Integer mp;
    private List<Observer> observers = new ArrayList();
    public Integer getHp() {
        return hp;
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(int hp){
        for(Observer observer:observers){
            observer.update();
        }
    }
    public void setHp(Integer hp) {
        this.hp = hp;
       //通知观察者
        notifyObservers(hp);
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
