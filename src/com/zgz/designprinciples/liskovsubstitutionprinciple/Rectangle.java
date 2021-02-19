package com.zgz.designprinciples.liskovsubstitutionprinciple;
/**
 * 长方形类
 */
public class Rectangle implements Quadrilateral{
    private double width;
    private double height;
    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
