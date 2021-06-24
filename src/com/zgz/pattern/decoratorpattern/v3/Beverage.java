package com.zgz.pattern.decoratorpattern.v3;
/**
 * 针对v2版本问题 比如是否要加牛奶 等 可能会想我在父类中添加一个boolean值去判断
 */
public  class Beverage {
    private String desc;
    private boolean milk;
    //豆浆
    private boolean soy;

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public Beverage(String desc) {
        this.desc = desc;
    }
    //价格
    public  double cost(){
        double total = 0;
        if(milk){
            total+=0.2;
        }
        if(soy){
            total+=0.2;
        }
        return total;
    }


    public String getDesc() {
        return desc;
    }
}
