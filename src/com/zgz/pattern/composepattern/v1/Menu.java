package com.zgz.pattern.composepattern.v1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private String desc;
    private List<MenuItem> list = new ArrayList<>();
    public Menu(String name, String desc) {
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

    public void add(MenuItem menuItem){
        if(null!=menuItem){
            list.add(menuItem);
        }
    }
    public void remove(MenuItem menuItem){
        if(null!=menuItem){
            list.remove(menuItem);
        }
    }
    public void print(){
        for(MenuItem menuItem:list){
            menuItem.print();
        }
    }
}
