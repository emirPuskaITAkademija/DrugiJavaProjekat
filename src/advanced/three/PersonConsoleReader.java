package advanced.three;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonConsoleReader {

    public List<Person> readPersons(InputStream inputStream) {
        List<Person> persons = new ArrayList<>();
        try (Scanner personScanner = new Scanner(inputStream);) {
            String[] nizPolja = null;
            do{
                
                String korisnickiInput = personScanner.nextLine();
                nizPolja = korisnickiInput.split(" ");
                
                Person person = null;
                
                persons.add(person);
            }while (personScanner.hasNextLine() && nizPolja!=null && nizPolja.length==3) ;
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
        return persons;
    }

    //IME PREZIME year/month/day
    //Tarik Pozder 1995/7/21
    //String korisnickiInput = personScanner.nextLine();
    //String[] polja = korisnickiInput.split(" ");
    public Person readPerson(InputStream inputStream) {

        try (Scanner personScanner = new Scanner(inputStream);) {
            System.out.println("Unesi korisničke podatke u formatu:Ime Prezime year/month/day");
            String korisnickiUnos = personScanner.nextLine();
            String[] polja = korisnickiUnos.split(" ");
            String ime = polja[0];
            String prezime = polja[1];
            String datumRodjenja = polja[2];
            String[] datumRodjenjaPolja = datumRodjenja.split("/");
            String yearString = datumRodjenjaPolja[0];
            int year = Integer.parseInt(yearString);
            String monthString = datumRodjenjaPolja[1];
            int monthNumber = Integer.parseInt(monthString);
            Month month = Month.of(monthNumber);
            String dayString = datumRodjenjaPolja[2];
            int day = Integer.parseInt(dayString);
            LocalDate birthday = LocalDate.of(year, month, day);
            Person personObject = new Person(0, ime, prezime, birthday);
            return personObject;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return null;
    }
}
