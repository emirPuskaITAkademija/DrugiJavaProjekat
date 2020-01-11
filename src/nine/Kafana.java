package nine;

import nine.abstraction.interfaces.Beverage;
import nine.abstraction.interfaces.BeverageFactory;
import nine.abstraction.interfaces.MilkDecorator;

public class Kafana {

    public static void main(String[] args) {
        Kafana kafana = new Kafana();
        BeverageFactory bosnianCaffeFactory = BeverageFactory.BOSNIAN_CAFFE;
        Beverage bosanskKafa = bosnianCaffeFactory.produceBeverage();
        Beverage espresso = BeverageFactory.ESPRESSO_FACTORY.produceBeverage();
        BeverageFactory hadziciTvornica = BeverageFactory.COCA_COLA;
        Beverage cocaCola = hadziciTvornica.produceBeverage();
        kafana.pijePiceUKafani(bosanskKafa);
        kafana.pijePiceUKafani(espresso);
        kafana.pijePiceUKafani(cocaCola);
        
        Beverage milkDekorisanoPice = new MilkDecorator(espresso);
        kafana.pijePiceUKafani(milkDekorisanoPice);
        
        Beverage milkDekorisanaBosanka = new MilkDecorator(bosanskKafa);
        kafana.pijePiceUKafani(milkDekorisanaBosanka);

    }

    void pijePiceUKafani(Beverage beverage) {
        System.out.println("Pijem: " + beverage.getName() + " i to me košta: " + beverage.cost());
    }
}
