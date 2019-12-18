package four;

import javax.swing.JOptionPane;

public class StringSwitchDemo {

    public static void main(String[] args) {
        String weekName = JOptionPane.showInputDialog("Unesi ime dana u sedmici na Engleskom jeziku");
        //>= 1.7 SE
        switch (weekName.toLowerCase()) {
            case "monday":
                System.out.println("Unio si English verziju ponedeljka");
                break;
            case "tuesday":
                System.out.println("Unio si English verziju utorka");
                break;
            case "wednesday":
                System.out.println("Unio si English verziju srijede");
                break;
            default:
                System.out.println("Bolje nauci Engleski");
                break;
        }
    }
}
