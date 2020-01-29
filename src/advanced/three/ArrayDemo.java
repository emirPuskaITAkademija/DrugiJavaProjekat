/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.three;

//Izuzeci - Exceptions

import java.util.Scanner;

//1. checked
//2. unchechecked

//1. izuzetke na koje mozemo uticati 
//2. izuzetke na koje ne mozemo uticati

public class ArrayDemo {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        String korisnickiUnos = "Tarik Pozder 1995/7/21";
        String[] polja = korisnickiUnos.split(" ");
        System.out.println(polja[3]);//programer
        System.out.println("TEST");
        //< 1.7
        //try - catch - finally
        //try-with-resource
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }finally{
            if(scanner != null){
                scanner.close();
            }
        }
        //
        
    }
 
}
