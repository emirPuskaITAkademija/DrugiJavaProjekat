package four;

import java.util.Scanner;

public class SwitchDemo1 {

    public static void main(String[] args) {
        System.out.println("Unesi ime mjeseca da saznaš koji je po redu taj mjesec u godini");
        String userInputText = new Scanner(System.in).nextLine();
        int monthNumber;
        //>=Java 1.7
        //switch-case-break
        switch (userInputText.toLowerCase()) {
            case "januar":
                monthNumber = 1;
                break;
            case "februar":
                monthNumber = 2;
                break;
            default:
                monthNumber = 0;
                break;
        }
        if (monthNumber == 0) {
            System.out.println("Moja godina ne podrzava to sto si ti unio = " + userInputText);
        } else {
            System.out.println("Broj mjeseca u godini je = " + monthNumber);
        }
    }
}
