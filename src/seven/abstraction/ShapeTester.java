
package seven.abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape1 = new Circle(0, 0, 3.0);
        Shape shape2 = new Rectangle(0, 0, 10.0, 20.7);
        shapesProcessor(shape1, shape2);
        shape2 = new Circle(0, 0, 4.0);
    }
    static void shapesProcessor(Shape...shapes){
        for(Shape shape: shapes){
            shapeProcessor(shape);
        }
    }
    static void shapeProcessor(Shape shape){
        shape.draw();
        double area = shape.calculateArea();
        System.out.println(area);
    }
 
}
