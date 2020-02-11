package konsultacije;

import java.time.LocalDate;
import java.time.Month;

public class PersonTester {

    public static void main(String[] args) {
        //Person == equals
        Publisher publisher = Publisher.create();
        LocalDate adnanBirthday = LocalDate.of(1985, Month.JUNE, 12);
        Person p1 = new Person(0, "Adnan", "Husika", adnanBirthday, Gender.MALE);
        Person p2 = new Person(0, "Adnan", "Husika", LocalDate.of(1985, Month.JUNE, 12), Gender.MALE);
    
        boolean daLiSuJednaki = p1 == p2;
        System.out.println(daLiSuJednaki);
        boolean daLiSuJednaki2 = p1.equals(p2);
        System.out.println(daLiSuJednaki2);
        
        //STRING
        String name1 = "Almir";
        String name2 = new String("Almir").intern();
        boolean daLiSuNameJednaki = name1 == name2; // == poredi memorijsku lokaciju
        System.out.println(daLiSuNameJednaki); 
        boolean daLiSuNameJednaki2 = name1.equals(name2); // true
        System.out.println(daLiSuJednaki2);
    }
}
