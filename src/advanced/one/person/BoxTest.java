package advanced.one.person;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BoxTest {

    public static void main(String[] args) {
        Box<Integer> adnanovaKutija = new Box<Integer>(23);
        Box<String> aleminaKutija = new Box<>("Lejla");
        Box<Double> ivaninaKutija = new Box<>(23.34);
        LocalDate now = LocalDate.now();
        Box<LocalDate> aldinovaKutija = new Box<>(now);

        Person[] persons = new Person[3];
        Person osman = new Person("Osman", LocalDate.of(1985, Month.MARCH, 1), Gender.MALE);
        persons[0] = osman;
        persons[1] = new Person("Lejla", LocalDate.of(2005, Month.JULY, 1), Gender.FEMALE);
        persons[2] = new Person("Ivana", LocalDate.of(2000, Month.JANUARY, 29), Gender.FEMALE);
        List<Person> personArrayList = new ArrayList<>();
        boolean osmanUbacen = personArrayList.add(osman);
        personArrayList.add(new Person("Lejla", LocalDate.of(2005, Month.JULY, 1), Gender.FEMALE));
        personArrayList.add(new Person("Osman", LocalDate.of(1985, Month.MARCH, 1), Gender.MALE));

        personArrayList.add(new Person("Osman", LocalDate.of(1985, Month.MARCH, 1), Gender.MALE));
    }
}
