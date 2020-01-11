package nine.abstraction;

import seven.abstraction.*;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void move();
    
    public abstract void run();
}
