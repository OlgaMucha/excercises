package org.example;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
            this.isTriangle();
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
    }

    public Triangle() {
    }

    public void isTriangle() throws IllegalTriangleException {
        if (!((this.side1 + this.side2 > this.side3) && (this.side1 + this.side3 > this.side3) && (this.side2 + this.side3 > this.side1))){
            throw new IllegalTriangleException("Not a triangle");
        }
    }
}
