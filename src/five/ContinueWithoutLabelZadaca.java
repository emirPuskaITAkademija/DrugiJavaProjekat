/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package five;

import java.util.Scanner;

/**
 *
 * @author grupa 1
 */
public class ContinueWithoutLabelZadaca {

    public static void main(String[] args) {
        System.out.println("Unesi neko slovo. Ako uneseš rečenicu ja ću uzeti prvo slovo iz rečenice");
        String rijec = new Scanner(System.in).nextLine();
        //sub
        String recenica = "Look for a substring";
        int duzinaRecenice = recenica.length();
        int duzinaRijeci = rijec.length();
        int max = duzinaRecenice - duzinaRijeci;
        boolean foundIt = false;
        HUSIKA:
        for (int i = 0; i <= max; i++) {
            // i = 0
            int brojac = i;
            for (int j = 0; j < rijec.length(); j++) {
                // j = 0, 1, 2 -> i = 0
                char recenicaSlovo = recenica.charAt(brojac);
                brojac++;
                char rijecSlovo = rijec.charAt(j);
                int brojacSlova = 0;
                if (rijecSlovo == recenicaSlovo) {
                    brojacSlova++;
                }
            }
        }

        System.out.println(foundIt ? "Pronašao" : "Nisam");
    }
}
