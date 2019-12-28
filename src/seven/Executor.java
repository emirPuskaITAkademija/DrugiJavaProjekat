/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

/**
 *
 * @author grupa 1
 */
public class Executor {

    public static void main(String[] args) {
        Person innerAlic = new Person("Iner", "Alić");
        Person.InnerClass i1 = innerAlic.new InnerClass(0, 0);
        Person.StaticInnerClass s1 = new Person.StaticInnerClass(0, 0);
        Person dzenaNiksic = new Person("Džena", "Nikšić");
        System.out.println(dzenaNiksic.toString());
        System.out.println(innerAlic.toString());
        innerAlic.addMoney("Rođak iz Australije", 10.0, 230.34, 10000.50);
        innerAlic.addMoney("Iz Amerike dajdža", 100.0);
        //SevenExecutor sevenExecutor = new SevenExecutor();
        //sevenExecutor.printPerson(innerAlic);
        int number1 = 10;
        int number2 = 11;
        System.out.println("n1 = " + number1 + ", n2 = " + number2); // 10 i 11
        swap(number1, number2);
        System.out.println("n1 = " + number1 + ", n2 = " + number2); //11 i 10

        //
        int broj = 34;
        Person personObject = new Person("Elmedin", "Bešlagić");
        System.out.println("Number = " + broj + " Person = " + personObject.toString());
        swapPerson(broj, personObject);
        System.out.println("Number = " + broj + " Person = " + personObject.toString());
    }

    private static void swapPerson(int number, Person p) {
        System.out.println("U FUNKCIJI  ");
        System.out.println("Number = " + number + " Person = " + p.toString());
        number = 345;
        //p = new Person("Enis", "Bešlagić");
        p.setName("Enis");
        p.setSurname("Bešlagić");
        System.out.println("Number = " + number + " Person = " + p.toString());
        System.out.println("FUNKCIJA zavrsila");
    }

    //vrijednost 
    private static void swap(int n1, int n2) {
        System.out.println("U funkciji: ");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);//10 i 11
        int temp = n2;
        n2 = n1;
        n1 = temp;
        System.out.println("n1 = " + n1 + ", n2 = " + n2); // 11  i 10
        System.out.println("Funkcija zavrsila...");
    }

}
