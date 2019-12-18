package two;

/**
 * Dvije vrste tipova podataka:
 * <li> 1. Prosti ili primitivni tipovi
 *  1.1 Byte 8 -bitni podatak
 *  1.2 short 16-bitni 
 *  1.3 int 32 -bit
 *  1.4 long 64 -bitni
 *  1.5 float 32
 *  1.6 double
 *  1.7 boolean 
 *  1.8 char 
 * <li>2. Složeni ili object tipovi
 *
 * @author grupa 1
 */
public class TwoExecutor {
    public static void main(String[] args) {
        // dekadnu 13 -> tip ime(varijabla) = vrijednost;
        byte byteVariable=13;
        byteVariable = 14;
        byteVariable = 127;
        System.out.println(byteVariable);
        //short, int, long -> cijele brojeve
        short shortNumber = -32768;
        //32-bitni int (-2na16 0  2na16-1
        int intNumber = 327680000;
        long longNumber = intNumber;// automatska konverzija
        intNumber = (int)longNumber;// eksplicitnu konverziju
        
        long longNumber2 = 3276800000L;
        
        //float, double
        //32 bitna
        float floatNumber = 2.3F;
        double doubleNumber = 2.3;
        
        //char 
        char singleCharVariable = 'a';
        singleCharVariable = 67;
        System.out.println(singleCharVariable);
        
        //boolean
        boolean var = false;
        var = true;
        
        
    }
}
