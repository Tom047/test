package com.company;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle();
        circle2.setRadius(4.0);
        System.out.println(circle1.getId() + " : " + circle1.area());
        System.out.println(circle2.getId() + " : " + circle2.area());
    }
}
