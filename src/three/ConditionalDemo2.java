package three;

import java.util.Scanner;
//Another conditional operator ternar if -> ?
// instanceOf
public class ConditionalDemo2 {

    public static void main(String[] args) {
        System.out.println("Unesi prvi broj:");
        Scanner nasScanner = new Scanner(System.in);
        int prviUneseniBroj = nasScanner.nextInt();
        System.out.println("Unesi drugi broj ako ti se ne gadi:");
        int drugiUneseniBroj = nasScanner.nextInt();
        boolean condition = prviUneseniBroj == drugiUneseniBroj;
        String message = condition ? "Jednaki brojevi" : "Nejednaki brojevi";
        System.out.println(message);
    }
}
