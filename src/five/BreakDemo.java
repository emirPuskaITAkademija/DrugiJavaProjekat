package five;

import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {
        System.out.println("Unesi cijeli broj:");
        Scanner nasScanner = new Scanner(System.in);
        int searchFor = nasScanner.nextInt();
        int[] numbers = {23, 34, 45, 56, 67, 13, 23, 21, 31, 3446};
        boolean foundIt = false;
        for(int i = 0; i<numbers.length; i++){
            // i - indeks
            // vrijednost -> na indeksu i
            int mutant = numbers[i];
            if(mutant == searchFor){
                foundIt = true;
                break;
            }
            System.out.println(mutant);
        }
        String message = foundIt ? "Pronađen broj u nizu": "Nije pronađen broj u nizu";
        System.out.println(message);
        
    }
}
