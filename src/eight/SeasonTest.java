/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

import java.util.Scanner;

public class SeasonTest {

    //Season[] -> 0, 1, 2, 3
    public static void main(String[] args) {

        //<Java SE 1.7
        //>= Java SE 1.7 String
       // System.out.println("Unesi redni broj od 1-4: ");
        //int redniBroj = new Scanner(System.in).nextInt();
        //Season season = Season.findSeasonByRedniBroj(redniBroj);
        System.out.println("Unesi ime godišnjeg doba na bosanskom jeziku: ");
        String korisnickiUnos = new Scanner(System.in).nextLine();
        Season season = Season.findSeasonByName(korisnickiUnos);
        if (season != null) {
            switch (season) {
                case AUTUMN:
                    System.out.println(season.dohvatiImeGodisnjegDoba());
                    break;
                case SPRING:
                    System.out.println(season.dohvatiImeGodisnjegDoba());
                    break;
                case SUMMER:
                    System.out.println(season.dohvatiImeGodisnjegDoba());
                    break;
                case WINTER:
                    System.out.println(season.dohvatiImeGodisnjegDoba());
                    break;
                default:
                    System.out.println("Not supported");
            }
        }

    }
}
