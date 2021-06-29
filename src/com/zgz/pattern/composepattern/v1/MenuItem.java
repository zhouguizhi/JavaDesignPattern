package com.zgz.pattern.composepattern.v1;

public class MenuItem {
    private String name;
    private String desc;
    public MenuItem(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void print(){
       System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
