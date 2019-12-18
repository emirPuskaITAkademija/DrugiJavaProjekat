package four.loops;

import java.util.Scanner;
/**
 * 
 * for(pocetni_uslov; uslov_pelje; korak_petlje){
 * 
 * }
 * 
 * @author grupa 1
 */
public class ForDemo {

    public static void main(String[] args) {
        //int count = new Scanner(System.in).nextInt();
        for(int count = new Scanner(System.in).nextInt() ; count<11; count++){
            System.out.println("Printam count = " + count);
        }
        //System.out.println(count);
        
        for( ; ; ){
            System.out.println("Ja sam u beskonacnoj petlji");
        }
    }
}
