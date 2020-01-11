package nine.abstraction;

import seven.abstraction.*;

public class Rectangle extends Shape {

    private  double a;
    private final double b;

    public Rectangle(int x, int y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        a = 34;
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("Iscrtavamo RECTANGLE..");
    }

}
