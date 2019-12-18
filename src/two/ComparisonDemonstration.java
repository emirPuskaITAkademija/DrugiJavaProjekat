package two;


import java.util.Scanner;
//Operatori poređenja
//1. == equal to 
//2. != not equal to
//3. > greater than
//4. >=
//5. <
//6. <=
public class ComparisonDemonstration {
    public static void main(String[] args) {
       
        System.out.println("Molim vas unesite prvi broj:");
        int prviBroj = new Scanner(System.in).nextInt();
        
        System.out.println("Molim vas unesite drugi broj:");
        int drugiBroj = new Scanner(System.in).nextInt();
        int result = prviBroj + drugiBroj;
        System.out.println("Suma unesenih brojeva je = " + result);
        //equal to
        if(prviBroj == drugiBroj){
            System.out.println("Uneseni brojevi su jednaki");
        }
        if(prviBroj != drugiBroj){
            System.out.println("Uneseni brojevi nisu jednaki");
        }
        if(prviBroj > drugiBroj){
            System.out.println("Prvi je veci od drugog");
        }
        if(prviBroj >= drugiBroj){
            System.out.println("Prvi je ili veci ili je jednak drugom broju");
        }
        if(prviBroj < drugiBroj){
            System.out.println("Prvi je manji od drugog");
        }
        if(prviBroj <= drugiBroj){
            System.out.println("Prvi je manji ili je jednak drugom");
        }
    }
}
