package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;
    private int sidesCount = 4;
    private float perimeter;
    private double area;

    public Square(int side) {

        this.side = side;
    }

    public String getName() {

        return "Square";
    }

    public float getPerimeter() {
        return side * 4;
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public double getArea() {
        area=side*side;
        return area;
    }
}
