package nine.abstraction;
//Koncepti OO programming
//1. Enkapsulacija

import seven.abstraction.*;
//Koncepti OO programming
//1. Enkapsulacija
//2. Nasljeđivanje
//3. Polimorfizma
//4. Abstraction
public class ShapeTester {

    public static void main(String[] args) {
        ShapeTester shapeTester = new ShapeTester();
        Shape shape1 = new Circle(0, 0, 3.0);
        Shape shape2 = new Rectangle(0, 0, 10.0, 20.7);
        shapeTester.shapesProcessor(shape1, shape2);
        shape2 = new Circle(0, 0, 4.0);
    }

    //Shape[] shapes
    void shapesProcessor(Shape... shapes) {
        
        for (Shape shape : shapes) {
            shapeProcessor(shape);
        }
    }

    void shapeProcessor(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.println(area);    }

}
