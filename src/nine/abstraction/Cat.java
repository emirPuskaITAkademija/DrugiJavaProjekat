package nine.abstraction;

import seven.abstraction.*;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Krećem se kao MAČKA...");
    }

    @Override
    public void run() {
        System.out.println("Trčim kao DIVLJA MAČKA....");
    }
    
    
}
