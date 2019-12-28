package seven.abstraction;

public abstract class Shape {
    private static int counter = 0;
    private int x;
    private int y;

    public Shape(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    
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
