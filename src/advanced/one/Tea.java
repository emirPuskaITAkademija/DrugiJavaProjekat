package advanced.one;

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
