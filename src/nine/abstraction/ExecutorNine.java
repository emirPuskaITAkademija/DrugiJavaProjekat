/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.abstraction;

public class ExecutorNine {
    public static void main(String[] args) {
        testStackOverflow();
    }
    
    static void testStackOverflow(){
        testStackOverflow();
    }
}
