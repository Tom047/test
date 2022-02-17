package aitu.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points;
    private static int id_gen=0;
    private int id;
    ArrayList<Double> pointDistance;

    public Shape() {
        id=id_gen++;
        points = new ArrayList<>();
        pointDistance = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void pointDistance(){
        //implement initializing distance of sides
        for(int i = 0; i < points.size(); i++) {
            pointDistance.add(points.get(i).distance(points.get((i+1)%points.size())));
        }
    }

    public double calculatePerimeter() {
        double P = 0;
        for(int i = 0; i < points.size(); i++) {
            P += pointDistance.get(i);
        }
        return P;
    }

    public double longestSide() {
        double longest = 0;
        for(int i = 0; i < points.size(); i++) {
            longest = (longest < pointDistance.get(i)) ? pointDistance.get(i) : longest;
        }
        return longest;
    }

    public double average() {
        double avg;
        avg = calculatePerimeter() / points.size();
        return avg;
    }
}
