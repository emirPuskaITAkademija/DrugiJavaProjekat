package nine.abstraction.interfaces;

public enum BeverageFactory {
    ESPRESSO_FACTORY(new Espresso()),//new BeverageFactory(new Espresso())
    MILK_FACTORY(new Milk()),
    COCA_COLA(new CocaCola()),
    TEA(new Tea()),
    BOSNIAN_CAFFE(new BosnianCaffe());

    //DEFINICIJA
    private Beverage beverage;

    private BeverageFactory(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage produceBeverage() {
        return beverage;
    }

}
