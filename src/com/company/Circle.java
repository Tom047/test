package com.company;

public class Circle {
    private double radius;
    private static int id_gen = 0;
    private int id;

    public Circle() {
        id = id_gen++;
    }

    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * Math.pow(radius, 2);
    }
}
