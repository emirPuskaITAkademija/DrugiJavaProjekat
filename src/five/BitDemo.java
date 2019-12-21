/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package five;
//Operacije na nivou bita
// 1. Bitwise OR -> |
// 2. Bitwise AND -> &
// 3. Bitwise XOR -> ^
// 4. Bitwise complement -> ~
public class BitDemo {
    public static void main(String[] args) {
        //inicijalne vrijednosti
        int a = 5; // 0101 -> 1010 = 10
        int b = 7; // 0111
        //Bitwise OR
        int res = a|b;
        System.out.println(" a | b = " + res);
        //Bitwise AND
        res = a&b;
        System.out.println("a & b = " + res);
        //Bitwise XOR
        res = a^b;
        System.out.println("a ^ b = " + res);
        //Bitwise ~
        res = ~a;
        System.out.println("~a = " + res);
        //>>1
        res = a >> 1;
        System.out.println("a>>1 = " + res);
        //<<2
        res = a<<2; // 5*4
        System.out.println("a << 1 = " + res);
        
    }
}
