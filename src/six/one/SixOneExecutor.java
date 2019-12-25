package six.one;

import six.Person;

public class SixOneExecutor {

    // 2x^2 + 3x +5 -> x =2 -> 
    //x = 4 ->
    public static void main(String[] args) {
        Person.printCounter();
        Person p1 = new Person("Adnan", "Husika");
        //p1 -> tipa Person ali i tipa Object
        p1.putSomeMoneyOnAccount(1350.0);
        p1.withdrawSomeMoneyOnAccount(150.0);
        //double p1Balance = p1.getBalance();
        SixOneExecutor sixOneExecutor = new SixOneExecutor();
        sixOneExecutor.printPersonBalance(p1);
        Person p2 = new Person("Iner", "Alić");
        p2.putSomeMoneyOnAccount(1200.0);
        p2.withdrawSomeMoneyOnAccount(20.0);
        sixOneExecutor.printPersonBalance(p2);
    }

    void printPersonBalance(Person p) {
        System.out.println("Kolko imaš love = " + p.getBalance());
    }
}
