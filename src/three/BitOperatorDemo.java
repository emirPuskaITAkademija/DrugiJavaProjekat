package three;
//Operatori na nivou bita
//1. Shift right
//2. Shift left
//3. komplement 
//4. &
//5. ~ 
// TIP imeVarijable = vrijednost
public class BitOperatorDemo {
    public static void main(String[] args) {
        int number = 12;
        System.out.println(number);
        System.out.println(number>>2);
        int drugiNumber = 12;
        System.out.println(drugiNumber);
        System.out.println(drugiNumber<<2);
        int number3 = 12;
        //
        System.out.println(~number3);
    }
}
