package two;
//Unarni 
//1. + plus
//2. - minus
//3. ++ Increment; inkrementira vrijednost za 1 
//4. -- Decrement
//5. ! Logički komplement
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 233;
        //Increment
        //Post increment
        number++;
        System.out.println(number);//234
        //Pre increment
        ++number;//235
        System.out.println(number);//235
        System.out.println(number++);//235
        System.out.println(number);//236
        System.out.println(++number);//237
        System.out.println(number);//237
        System.out.println("POSLIJE RESETA");
        //reset
        number = 10;
        //Decrement
        //post
        number--;
        System.out.println(number);
        number = 10;
        //pre
        --number;
        System.out.println(number);
        //
        number = 10;
        System.out.println(number--);
        System.out.println(number);
        //
        number = 10;
        System.out.println(--number);
        System.out.println(number);
        
        boolean success = true;
        System.out.println(success);
        System.out.println(!success);
        
        
    }
}
