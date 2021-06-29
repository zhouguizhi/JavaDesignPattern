package com.zgz.pattern.composepattern.v1;


public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("川菜","真的很辣");
        MenuItem menuItem = new MenuItem("剁椒鱼头","真的很好吃,特别是鱼头");
        menu.add(menuItem);
        menu.print();
    }
}
