package advanced.four;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListWriter {

    public static final int SIZE = 10;
    //polje
    private List<String> names;

    //konstruktor
    public ListWriter() {
        super();
        names = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            names.add("Person " + i);
        }
    }

    public void writeNames() {
        FileWriter writer = null;
        //try-catch-finally
        try {
            writer = new FileWriter("sabrija.txt");
            PrintWriter out = new PrintWriter(writer);
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i+1);
                out.println(name);
            }
        } catch (IOException ex) {
            System.err.println(ex.getLocalizedMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }

}
