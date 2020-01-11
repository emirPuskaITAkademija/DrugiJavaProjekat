package nine.abstraction.interfaces;

public class MilkDecorator implements Beverage {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.6;
    }

    @Override
    public String getName() {
        return beverage.getName() + " s mlijekom";
    }

}
