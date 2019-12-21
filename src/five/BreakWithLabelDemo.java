package five;

import java.util.Scanner;

public class BreakWithLabelDemo {

    public static void main(String[] args) {
        System.out.println("Unesi cijeli broj:");
        int uneseniBroj = new Scanner(System.in).nextInt();
        int[][] dvodimenzionalniNiz = {
            {32, 1, 13, 467, 879},//5
            {12, 23, 34, 45, 56, 12345},// 45, 56, 12345
            {0, 622, 127, 77, 955}
        };
        boolean foundIt = false;
        int i = 0;
        int j = 0;
        NASA_LABELA:
        for (i = 0; i < dvodimenzionalniNiz.length; i++) {
            // i = 0, 1 , 2
            int[] niz = dvodimenzionalniNiz[i];
            for (j = 0; j < niz.length; j++) {
                // j = 0, 1, 2, 3, 4, 5 -> i = 0
                // j = 0 , 1, 2 -> i = 1  (1, 2) = 34
                // j = 0 ,1 , 2, 3, 4 -> i = 2
                int var = niz[j]; // 34 == 34
                if (var == uneseniBroj) {
                    foundIt = true;
                    break NASA_LABELA;
                }
            }

        }

        if (foundIt) {
            System.out.println("Pronašao sam " + uneseniBroj + " na poziciji [" + i + "," + j + "]");
        } else {
            System.out.println("Nisam pronašao");
        }
    }
}
