package six;
//Ova klasa koja se isto zove kao i fajl koji predstavlja je tzv. OUTER klasa
//Klasa -> šablon po kom ćem kreirati mnoštvo varijabli odnosno objekata ili instanci
//MODIFIKATOR vidljivosti
//1. public -> javno dostupna svima
//2. bez ključne -> paketno privatna vidljivost
//3. protected -> paketno privatna vidljivost ali malo šira vidljivost 
//4. private -> privatna vidljivost - dostupnost samo unutar blok koda unutar kojeg je definirana klasa, funkcija, 

//OUTER klasa 
//1. public
//2. bez kljucne riječi
//3. protected -> NE
//4. private -> NE
/**
 * ŠTA OVA KLASA može imati unutar svog blok koda: 1. POLJA ili ATTRIBUTES ili
 * PROPERTIES 1.1 static 1.2 instancna ili objektna polja 2. KONSTRUKTOR //1.
 * public //2. package private //3. protected //4. private 3. FUNKCIJE ili
 * METODE //1. public //2. package private //3. protected //4. private 3.1
 * static 3.1 objektne ili instancne
 *
 * @author grupa 1
 */
public class Person {

    //1.1 static property
    private static int counter = 0;
    //1.2 instance or object properties
    public int age;
    protected String name;
    protected String surname;
    private double balance = 0.0;

    public Person(String param1, String surname) {
        this(param1, surname, 0);
    }

    //OVERLOAD po broju parametara ili PREKLAPANJE
    public Person(String name1, String surname1, int age) {
        this.name = name1;
        this.surname = surname1;
        this.age = age;
        counter++;
    }

    //OVERLOAD po tipu parametara ili PREKLAPANJE
    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
        counter++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static void printCounter() {
        System.out.println("Counter = " + counter);
    }

    public void putSomeMoneyOnAccount(double money) {
        balance = balance + money;
    }

    public void withdrawSomeMoneyOnAccount(double money) {
        balance = balance - money;
    }

    public void changeBalanceState(double money) {
        changeBalanceState(money, false);
    }
    
    public void changeBalanceState(double money, boolean increase){
        if(increase){
            balance = balance + money;
        }else{
            balance = balance - money;
        }
    }

    public void changeBalanceState() {
        balance = balance - 2.3;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String dohvatiPrezime() {
        return surname;
    }
}
