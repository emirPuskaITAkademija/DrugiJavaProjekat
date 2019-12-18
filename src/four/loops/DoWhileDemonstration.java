package four.loops;

import java.util.Scanner;

public class DoWhileDemonstration {

    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        do{
            System.out.println("Printam count = " + count);
            count++;
        }while(count<11);
    }
}
