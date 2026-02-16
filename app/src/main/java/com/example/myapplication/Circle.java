package com.example.myapplication;

public class Circle extends Shape {
    public int radius;
    
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
