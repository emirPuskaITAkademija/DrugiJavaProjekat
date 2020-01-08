
package eight;

//1. Strong reference
//2. Weak reference
//3. Soft reference
//4. Phantom reference

import java.lang.ref.WeakReference;
import seven.Person;

public class ReferenceDemo {
    public static void main(String[] args) {
         //1. STRONG reference
        Person adnanHusika = new Person("Adnan", "Husika");//adnanHusika -> objekat ili referenca
        Object myObject = new Object();
        //2. WEAK reference
        WeakReference myObjectReference = new WeakReference(myObject);
        System.out.println(myObjectReference.get());
        System.gc();
        System.out.println(myObjectReference.get());
        
    }
}
