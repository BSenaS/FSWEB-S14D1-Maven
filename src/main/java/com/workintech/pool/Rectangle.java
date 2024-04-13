package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double height) {
        if (height < 0){
            this.length = 0;
        } else {
            this.length = height;
        }
    }
    public double getArea() {
        return width * length;
    }
    
}
