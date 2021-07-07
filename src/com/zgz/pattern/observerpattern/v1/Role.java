package com.zgz.pattern.observerpattern.v1;
/**
 * 角色
 */
public class Role {
    private String name;
    private Integer hp;
    private Integer mp;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
        //在这里hp发生变化的时候一定要通知3个地方进行变化,1:血条 2:球 3:面板
        System.out.println("血条更新hp为:="+hp);
        System.out.println("球更新hp为:="+hp);
        System.out.println("面板更新hp为:="+hp);
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
