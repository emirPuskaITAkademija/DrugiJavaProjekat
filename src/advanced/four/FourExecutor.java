package advanced.four;

import java.sql.SQLException;
//1. checked 
//2. unchecked
public class FourExecutor {
    public static void main(String[] args){
        //kolko je dug niz ; o, 1, 2, 3
        String[] names = new String[4];
        String name = names[0];
        names[3] = "Lejla";
        int x = 100 /0;
        System.out.println("Vozdra raja, ja sam malo promukao i oprostite");
    }
}
