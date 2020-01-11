package nine.abstraction.interfaces;
//Interfejsa mogu implementirati koliko hocu
//Extendati mogu samo jednu klasu
class Espresso implements Beverage{

    @Override
    public double cost() {
        return 2.0;
    } 

    @Override
    public String getName() {
        return "ESPRESSO";
    }
    
    
}
