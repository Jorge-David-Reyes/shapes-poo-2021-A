package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;
    private int sidesCount = 4;
    private float perimeter;
    private double area;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public float getPerimeter() {
        perimeter=base*2+height*2;
        return perimeter;
    }

    public double getArea() {
        area=base*height;
        return area;
    }
}
