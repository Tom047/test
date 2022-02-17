package aitu.java;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class AssignmentOne {
    public static void main(String[] args) throws FileNotFoundException  {
        Shape s1 = new Shape();
        Shape s2 = new Shape();
        Scanner sc1 = new Scanner(new File("C:/Users/tangi/IdeaProjects/untitled/src/aitu/java/file1.txt"));
        Scanner sc2 = new Scanner(new File("C:/Users/tangi/IdeaProjects/untitled/src/aitu/java/file2.txt"));
        int x, y;
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point p = new Point(x, y);
            s1.addPoint(p);
        }
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point p = new Point(x, y);
            s2.addPoint(p);
        }
        s1.pointDistance();
        s2.pointDistance();
        System.out.println("Perimeter of 1st shape: " + s1.calculatePerimeter());
        System.out.println("Longest side length: " + s1.longestSide());
        System.out.println("Perimeter of 2nd shape: " + s2.calculatePerimeter());
        System.out.println("Longest side length: " + s2.longestSide());
        System.out.println("Average length of 1st shape sides: " + s1.average());
        System.out.println("Average length of 2nd shape sides: " + s2.average());
        ArrayList<Point> copiedPoints = s2.getPoints();
    }
}
