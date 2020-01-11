package nine.abstraction.interfaces;


//Interfejs - tip podatka 
//Specijalan interfejs koji uvodi Java SE 1.8 -> Funkcionalni interfejs
//FUNKCIONALNI interfejs -> potreban i dovoljan uslov da "OBIČNI" interfejs postane
//funkcionalan je da ima JEDNU i SAMO JEDNU apstraktnu metodu.
//Može imati koliko vam duša poželi DEFAULT metoda i STATIČKI metoda ali JEDNU I SAMO JEDNU apstraktnu.
public interface Beverage {

    //POLJA
    public static final int COUNTER = 12;

    public abstract double cost();
   
    String getName();

    //Java SE >=1.8
    default void drink(String... params) {
       //
    }

    
    //
    public static void staticMethod() {
        System.out.println("Poziv iz javno dostupne statičke metode interfejsa..");
        System.out.println("Ne možemo koristiti privatno dostupnu statičku metodu jer koristimo Java 1.8 verziju. Za to nam je potrebna 1.9 ili veća verzija");
    }
}
