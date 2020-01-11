package nine.abstraction.interfaces;

class CocaCola implements Beverage {

    @Override
    public double cost() {
        return 3.5;
    }

    @Override
    public String getName() {
        return "COCA COLA";
    }
}
