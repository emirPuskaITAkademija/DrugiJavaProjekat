package eight;
//1. Prosti tipovi
//2. Složeni tipovi

import java.util.Scanner;
import seven.Person;

// 2.1 Objektni tipovi
// 2.2 Parametrizirani objektni-> Generičke tipove
public class EightExecutor {

    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        //1. prost or primitive
        System.out.println("Unesi broj: ");
        int number1 = mojScanner.nextInt();
        System.out.println("Unesi sad drugi broj: ");
        int number2 = mojScanner.nextInt();
        if (number1 == number2) {
            
            System.out.println(number1 + " = " + number2);
        }else{
            System.out.println(number1 + " != " + number2);
        }
        //2. složena ili object 
        char[] slova = new char[3];
        slova[0] = 'z';
        slova[1] = 'a';
        slova[2] = 65;
        Person person = new Person("Kenan", "Mandžo");

        //String
    }
}
