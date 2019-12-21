package five;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neko slovo. Ako uneseš rečenicu ja ću uzeti prvo slovo iz rečenice");
        char unesenoSlovo = new Scanner(System.in).nextLine().charAt(0);
        String text = "Vozdra svijete. Dobro dosli na peti psmfš špn";
        int brojPojavljivanja = 0;
        char[] nizKaraktera = text.toCharArray();
        for(int i = 0; i<nizKaraktera.length; i++){
            char jednoSlovo = nizKaraktera[i];
            //slovo 0
            if(jednoSlovo != unesenoSlovo){
                continue;
            }
            brojPojavljivanja++;//kada se 
        }
        System.out.println("Uneseno slovo '" + unesenoSlovo+"' se pojavljuje " + brojPojavljivanja+" puta");
    }
}
