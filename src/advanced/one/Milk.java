package advanced.one;

class Milk implements Beverage {

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String getName() {
        return "MILK";
    }
    
    //Beverage m1 = new Milk();
    //m1.cost();
}
