package advanced.four;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
//1. pročitati fajl pomoću Scanner
//2. skladištiti negdje sadržaj u memoriji
//3. upisati sadržaj u treci fajl koji mozete zvati kako hocete out.txt

public class Zadatak {

    public static void main(String[] args) {
        //ARM 
        //try - catch -finally ----> try-with-resource
        try (InputStream inputStream = new FileInputStream("sabrija.txt");
                Scanner scanner = new Scanner(inputStream); 
                Resource resource = new Resource();
                Writer writer = new FileWriter("output.txt");
                PrintWriter out = new PrintWriter(writer)) {
           // StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //String lineSeparator = System.lineSeparator();
                //sb.append(line+lineSeparator);
                out.println(line);
            }
            //String content = sb.toString();
            //out.println(content);
           // upisiUDrugiFajl(content);
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
    
    static void upisiUDrugiFajl(String content){
        try(Writer fileWriter = new FileWriter("output.txt");
              PrintWriter out = new PrintWriter(fileWriter)){
            out.println(content);
        }catch(Exception exception){
            System.err.println(exception.getLocalizedMessage());
        }
    }
}
