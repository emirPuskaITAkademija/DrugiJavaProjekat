package nine.abstraction.interfaces;

class Tea implements Beverage{

    @Override
    public double cost() {
        return 1.9;
    }  

    @Override
    public String getName() {
        return "TEA";
    }
}
