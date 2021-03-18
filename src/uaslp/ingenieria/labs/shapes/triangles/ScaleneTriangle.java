package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private int sideonebase;
    private int sidetwo;
    private int sidethree;
    private float height;
    private int sidesCount = 3;
    private float perimeter;
    private double area;

    public ScaleneTriangle(int sideonebase, int sidetwo, int sidethree, float height) {

        this.sideonebase = sideonebase;
        this.sidetwo = sidetwo;
        this.sidethree=sidethree;
        this.height=height;
    }

    public String getName() {
        return "ScaleneTriangle";
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public float getPerimeter() {
        perimeter=sideonebase+sidetwo+sidethree;
        return perimeter;
    }

    public double getArea() {
        area=(sideonebase*height)/2;
        return area;
    }
}
