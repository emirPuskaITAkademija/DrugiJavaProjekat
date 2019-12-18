package three;

import java.util.Scanner;

//COnditional AND -> &&
//Conditional OR -> || 
public class ConditionalDemo1 {

    public static void main(String[] args) {
        System.out.println("Unesi prvi broj:");
        Scanner nasScanner = new Scanner(System.in);
        int prviUneseniBroj = nasScanner.nextInt();
        System.out.println("Ziv bio unesi i drugi broj ako ti se ne gadi:");
        int drugiUneseniBroj = nasScanner.nextInt();
        if ((prviUneseniBroj == 1) && (drugiUneseniBroj == 2)) {
            System.out.println("Prvi broj = " + prviUneseniBroj + " , a drugi je = " + 2);
        }
        if ((prviUneseniBroj == 1) || (drugiUneseniBroj++ == 2)) {
            System.out.println("Dobro dosao u uslovni ILI operator. Prvi broj = " + prviUneseniBroj + " , a drugi je = " + 2);

        }
        System.out.println("Drugi unesen broj u konacnici = " + drugiUneseniBroj);
    }
}
