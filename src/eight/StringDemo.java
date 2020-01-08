package eight;

import javax.swing.JOptionPane;
//OMOTAČE prostih tipova (Autoboxing)
//int -> 32 bit Integer
//float -> Float
//1. Integer -> konverzija String u int

public class StringDemo {

    public static void main(String[] args) {
        String numberInput = JOptionPane.showInputDialog("Unesi cijeli broj: ");
        //konverziju iz String -> int
        int numberInputConverted = Integer.parseInt(numberInput);
        System.out.println("Konvertovani input iz UI = " + numberInputConverted);
        String floatNumberInput = JOptionPane.showInputDialog("Unesi decimalni broj:");
        float floatNumberInputConverted = Float.parseFloat(floatNumberInput);
        System.out.println("Konvertovani input iz UI = " + floatNumberInputConverted);
        // == 
        String name = new String("Adnan");// new -> konstruktora
        String name1 = new String("Adnan");//.intern()
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println("Stvari počinju ovdje da se lome...");
        String name2 = "Adnan"; // String literal
        String name3 = "Adnan";
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));
    }

}
