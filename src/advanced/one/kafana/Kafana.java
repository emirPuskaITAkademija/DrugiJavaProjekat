package advanced.one.kafana;

//Dizajn princip OOP: razdvoji instanciranje odnosno kreiranje objekata od njihovog korištenja

import advanced.one.Beverage;
import advanced.one.BeverageFactory;

//DRY - DOn't repeat yourself

public class Kafana {

    public static void main(String[] args) {
        BeverageFactory cocaColaFactory = BeverageFactory.COCA_COLA;
        Beverage b1 = BeverageFactory.COCA_COLA.produceBeverage();
        drink(b1);
        Beverage b2 = BeverageFactory.TEA.produceBeverage();
        drink(b2);
    }

    static void drink(Beverage b) {
        System.out.println("Pijem: " + b.getName() + "  i to me košta " + b.cost());
    }
}
