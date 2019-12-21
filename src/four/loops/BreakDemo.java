package four.loops;

import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {
        int searchFor = new Scanner(System.in).nextInt();
        int[] numbers = {23, 34, 45, 56, 67, 13, 23, 21, 31, 3446};
        boolean foundIt = false;
        for(int i =0 ; i<=(numbers.length-1); i++){
            int vrijednost = numbers[i];
            if(searchFor == vrijednost){
                foundIt = true;
                break;
            }
            System.out.println(vrijednost);
        }
        String message = foundIt ? "Postoji": "Ne postoji";
        System.out.println(message);
    }
}
