package nine.abstraction.interfaces;

class Milk implements Beverage {

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String getName() {
        return "MILK";
    }
}
