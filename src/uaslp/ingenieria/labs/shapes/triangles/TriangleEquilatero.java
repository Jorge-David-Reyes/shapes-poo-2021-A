package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;
    private float height;
    private int sidesCount = 3;
    private float perimeter;
    private double area;

    public TriangleEquilatero(int side, float height) {

        this.side = side;
        this.height=height;
    }

    public String getName() {
        return "TriangleEquilatero";
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public float getPerimeter() {
        perimeter=side * 3;
        return perimeter;
    }

    public double getArea() {
        area=(side*height)/2;
        return area;
    }
}
