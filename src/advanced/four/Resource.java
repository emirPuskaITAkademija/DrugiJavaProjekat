/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.four;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author grupa 1
 */
public class Resource implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Vozdra raja. Ja nikad necu pozvati ovu fuknciju ali ce to uraditi JAVA za men");
    }
    
}
