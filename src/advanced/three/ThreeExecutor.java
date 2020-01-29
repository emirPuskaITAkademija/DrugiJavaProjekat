package advanced.three;

import java.time.LocalDate;

/**
 * Pravimo program koji će iz konzole čitati listu korisnika. 1. kreirati klasu
 * Person -sa poljima: id(int), name(String), surname(String),
 * birthday(LocalDate) -polja treba da budu privatna a pristup poljima treba da
 * bude kroz get -konstruktor treba da bude konstruktor sa parametrima -toString
 * override 2. kreirati klasu PersonConsoleReader -ta klasa treba da pusti
 * korisniku da definira vrijednosti polja klase Person -nakon što korisnik
 * unese sva polja mi treba polja da negdje skladištimo
 *
 * @author grupa 1
 */
// Molim te unesi sljedeću personu u formatu: Ime Prezime year/month/day
public class ThreeExecutor {
    // Person p1 = new Person(0, "Alema", "Murtić", LocalDate.of(1982, 2, 19));

    public static void main(String[] args) {
        PersonConsoleReader consoleReader = new PersonConsoleReader();
        Person p2 = consoleReader.readPerson();
        System.out.println(p2.toString());
    }
}
