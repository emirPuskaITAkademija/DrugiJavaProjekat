package advanced.two;

import java.util.ArrayList;
import java.util.List;
//GENERIČKI TIPOVI
//BUGOVI ili GREŠKE su sastavni dio našeg mizernog programerskog života
// 1. compile errors
// 2. runtime errors

//Zašto su uvedeni generički tipovi ???
//1. Strožija provjera tipa podatka ali kada ??? Unutar COMPILE TIME
//2. Eliminacija ekplicitne konverzije
public class CollectionExecutor {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Zana";
        String elementNa0 = names[0];
        //backward compatibility 
        // 1.4  lista -> objekat tipa List, ArrayList, Collection , Iterable
        List lista = new ArrayList(); //RAW type ili SIROVI tip
        lista.add("Zana");
        String elementNaIndeksu0 = (String) lista.get(0); //ELMINIRA MI ovu konverziju
        //1.5, 1.6 programskog jezika
        List<String> lista1 = new ArrayList<String>();//parametrizirana lista1
        lista1.add("Zana");
        String elementNaIndeksu01 = lista1.get(0);
        //1.7 programskog jezika
        List<String> lista2 = new ArrayList<>();//diamond
    }
}
