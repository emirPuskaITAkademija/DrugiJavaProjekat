
package three.array;

public class ArrayDemonstration {
    public static void main(String[] args) {
        int number = 23;
        number = 34;
        char charVar = 'a';
        charVar = 'b';
        //Nizovi posjeduju polja  koja su INDEKSIRANA
        //1. način da kreiram niz
        int[] numbers = new int[2];
        numbers[0] = 23; // 
        numbers[1] = 34;
        String name = new String("Osman");// new - konstruktor 
        String name1 = "Osman"; // String literal
        
        System.out.println("Vrijednost niza 'numbers' na polju 1 odnosno druga vrijednost je = " +numbers[1]);
        
        numbers[1] = (int)5.6;//102
        System.out.println("Da li je ovo 'f' = "+numbers[1]);
        
        //2. način da kreiram nitz
        char[] characters = {'O', 's', 'm', 'a', 110};
        String osmanovoIme = new String(characters);
        System.out.println(osmanovoIme);
    }
}
