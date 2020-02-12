
package advanced.five;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("POZIVA SE blok koda od close methode");
    }
    
    public void something(){
        System.out.println("Nevene je pitao hoce li se ikada pozvati ova metoda");
    }
}
