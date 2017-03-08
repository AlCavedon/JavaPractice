/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author acavedon
 */
class Shape {
    public double area()
    {
        return 0; // we are going to override this
    }
}

class Circle extends Shape {
    private static final double PI = Math.PI;
    private double diameter;

    Circle(double d) {
        diameter = d;
    }
    
    public double area() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;

    Rectangle(double d, double d0) {
        height = d;
        width = d0;
    }
    
    public double area() {
        return height * width;
    }
}