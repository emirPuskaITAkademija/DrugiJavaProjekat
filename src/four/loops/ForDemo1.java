/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.loops;

public class ForDemo1 {
    public static void main(String[] args) {
        int[] numbers = {23, 34, 45, 56, 67, 13, 23, 21, 31, 3446};
        // naslijeđena for petlja iz C++
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Element na indeksu '" + i +"' = " + numbers[i]);
        }
        //enhanced for loop
        for(int mutant : numbers){
            System.out.println(mutant);
        }
    }
}
