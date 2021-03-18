package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.*;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEquilatero;
import uaslp.ingenieria.labs.shapes.triangles.IsoscelesTriangle;
import uaslp.ingenieria.labs.shapes.triangles.ScaleneTriangle;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();

        shapes.add(new Shape());

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(8, 3));
        shapes.add(new Rectangle(14, 10));
        shapes.add(new Square(10));
        shapes.add(new TriangleEquilatero(6, 5));
        shapes.add(new IsoscelesTriangle(6, 5, 7));
        shapes.add(new ScaleneTriangle(6, 7, 9, 8));

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("-----------------------------------------------");
        }
    }
}
