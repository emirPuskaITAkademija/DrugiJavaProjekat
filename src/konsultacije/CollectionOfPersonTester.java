package konsultacije;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionOfPersonTester {
    
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        LocalDate adnanBirthday = LocalDate.of(1985, Month.JUNE, 12);
        Person p1 = new Person(0, "Adnan", "Husika", adnanBirthday, Gender.MALE);
        Person p2 = new Person(0, "Adnan", "Husika", LocalDate.of(1985, Month.JUNE, 12), Gender.MALE);
        listOfPersons.add(p1);
        listOfPersons.add(p1);
        listOfPersons.add(p2);
        listOfPersons.add(new Person(0, "Adnan", "Husika", LocalDate.of(1985, Month.JUNE, 12), Gender.MALE));
        printList(listOfPersons);
        //SET
        //HASH SET
        System.out.println("");
        System.out.println("SET  IDE ............");
        Set<Person> setOfPersons = new HashSet<>();
        setOfPersons.add(p1);
        setOfPersons.add(p1);
        setOfPersons.add(p2);
        setOfPersons.add(new Person(0, "Adnan", "Husika", LocalDate.of(1985, Month.JUNE, 12), Gender.MALE));
        printCollection(setOfPersons);
        //TREE SET
        System.out.println("IDE TREE SET-....da li će ići--");
        Set<Person> setOfPersons1 = new TreeSet<>();
        setOfPersons1.add(p1);
        setOfPersons1.add(p1);
        setOfPersons1.add(p2);
        setOfPersons1.add(new Person(0, "Adnan", "Husika", LocalDate.of(1985, Month.JUNE, 12), Gender.MALE));
        printCollection(setOfPersons1);
    }
    
    public static void printList(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            System.out.println("Index: " + i + " " + p.toString());
        }
    }
    
    public static void printCollection(Collection<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
