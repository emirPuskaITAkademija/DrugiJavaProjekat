package nine.abstraction;

import seven.abstraction.*;

public abstract class Shape {
    private static int counter = 0;
    private int x;
    private int y;

    public Shape(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    //Shape shape = new Shape();
    //shape.calculateArea();
    //shape.draw();
    
    //Shape shape1 = new Rectangle();
    //shape1.calculateArea();
    
    //Shape shape2 = new Circle();
    //shape2.calculateArea();
    public abstract double calculateArea();
    
    public abstract void draw();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public static void printCounter(){
        System.out.println("Counter : " + counter);
    }
}
