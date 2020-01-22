package seven;
//OUTER klasa
//1. polja ili properties ili atribute
//2. konstruktor
//3. static & object or instance functions

//Koncept 
//OVERLOAD ili preklapanje po broju parametara ili po tipu
//OVERRIDE ili nadjačavanja
public  class Person extends Object  {

    //1. static field ili properties
    private static int counter = 0;
    //2. instancna ili objektna
    private String name;
    private String surname;
    private int age;
    private double balance = 0.0;

    public Person(String name, String surname) {
        // this(name, surname, 0);
        this.name = name;
        this.surname = surname;
        counter++;
    }

 

    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    
    //objektna
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //VAR ARGS
    public void addMoney(String message, double... moneyAmounts) {
        System.out.print(message + " ->");
        for (double amount : moneyAmounts) {
            balance = balance + amount;
        }
        System.out.println("Balance = " + balance);
    }

    public void spendMoney(double money) {
        balance = balance - money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(surname);
        //return name +" " + surname;//svakako se u pozadini pozove StringBuilder
        return sb.toString();
    }
    
    

    public static void printCounter(Person p) {
        System.out.println("Counter = " + counter);
        System.out.println("Ime: " + p.name);
    }

    //INNER klasa -> OBJEKTNA
    public class InnerClass {

        private int x;
        private int y;

        public InnerClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    //STATIC inner klasa
    public static class StaticInnerClass {

        private int x;
        private int y;

        public StaticInnerClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
