package seven.abstraction;

public class Square extends Shape{

    private double a;
    
    public Square(int x, int y, double a) {
        super(x, y);
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square...");
    }

}
