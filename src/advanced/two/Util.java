package advanced.two;

public class Util {
    
    //private K polje;
    
    //UNBOUNDED generic type on level of function or method
    public static <K,V> boolean compare(K value1, V value2){
        return value1.equals(value2);
    }
    
    // BOUNDED generic type
    public static <K extends Integer,V extends Integer> int compareNumbers(K number1, V number2){
        return number1.compareTo(number2);
    }
}
