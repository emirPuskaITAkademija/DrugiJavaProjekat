
package four.loops;

import java.util.Scanner;

/**
 * while(izraz){
 *   //blok koda
 * }
 * @author grupa 1
 */
public class WhileDemo {
    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        while(count<11){
            System.out.println("Printam count = " + count);
            count++;
        }
    }
}
