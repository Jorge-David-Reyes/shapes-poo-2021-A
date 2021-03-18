package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private float radio=5;
    private int sidesCount=0;
    private float perimeter;
    private double area;


    public Circle(int radio) {
        this.radio = radio;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras
    public String getName() {
        return "Circle";
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public float getPerimeter() {
        perimeter= (float) (2*Math.PI*radio);
        return perimeter;
    }

    public double getArea() {
        area= (float) (Math.PI*Math.pow(radio, 2));
        return area;
    }
}
