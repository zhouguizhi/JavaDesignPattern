package com.zgz.designprinciples.liskovsubstitutionprinciple;

public class Client {
    public static void main(String[] args) {
        //创建长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(6);
        rectangle.setHeight(8);
        resize(rectangle);
        printWidthAndHeight(rectangle);
        //创建正方形
        Square square = new Square();
        square.setSide(10);
        printWidthAndHeight(square);
    }
    public static void resize(Rectangle rectangle){
        if(null==rectangle){
            return;
        }
        while (rectangle.getWidth()<=rectangle.getHeight()){
            System.out.println("=============");
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    public static void printWidthAndHeight(Quadrilateral quadrilateral){
        if(null==quadrilateral){
            return;
        }
        System.out.println("width:="+quadrilateral.getWidth());
        System.out.println("height:="+quadrilateral.getHeight());
    }
}
