package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle {
    private int equalSides;
    private int minorSideBase;
    private float height;
    private int sidesCount = 3;
    private float perimeter;
    private double area;

    public IsoscelesTriangle(int equalSides, int minorSideBase, float height) {

        this.equalSides = equalSides;
        this.minorSideBase=minorSideBase;
        this.height=height;
    }

    public String getName() {
        return "IsoscelesTriangle";
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public float getPerimeter() {
        perimeter=equalSides*2+minorSideBase;
        return perimeter;
    }

    public double getArea() {
        area=(minorSideBase*height)/2;
        return area;
    }
}
