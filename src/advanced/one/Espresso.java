package advanced.one;
//Interfejsa mogu implementirati koliko hocu
//Extendati mogu samo jednu klasu
//OUTER klasa
class Espresso implements Beverage{

    @Override
    public double cost() {
        return 2.0;
    } 

    @Override
    public String getName() {
        return "ESPRESSO";
    }
    
    //Beverage b1 = new Espresso();
   // b1.cost();
}
