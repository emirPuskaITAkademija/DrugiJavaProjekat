package nine.abstraction;

import seven.abstraction.*;

public class Circle extends Shape {

    private final double r;

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Iscrtava se KRUG");
    }

    @Override
    public double calculateArea() {
        return r * r * Math.PI;
    }

}
