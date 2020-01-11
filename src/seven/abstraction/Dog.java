
package seven.abstraction;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Krecem se kao PAS...");
    }

    @Override
    public void run() {
        System.out.println("Trčim kao KER...");
    }
    
}
