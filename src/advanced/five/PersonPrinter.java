package advanced.five;

import java.util.Collections;
import java.util.List;

public class PersonPrinter {

    private final List<Person> persons;

    public PersonPrinter(List<Person> persons) {
        this.persons = persons;
    }

    public void printPersons1() {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(person);
        }
    }

    public void printPersons2() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
    
    public void printPersonAfterTesting(PersonTester personTester){
        for(Person p : persons){
            if(personTester.test(p)){
                System.out.println(p);
            }
        }
    }

    public void printPersonsWithSpecificName(String name) {
        for (Person p : persons) {
            boolean condition = p.getFirstName().equals(name);
            if (condition) {
                System.out.println(p);
            }
        }
    }

    public void printPersonsWithSpecificSurname(String surname) {
        for (Person p : persons) {
            boolean condition = p.getLastName().equals(surname);
            if (condition) {
                System.out.println(p);
            }
        }
    }

    public void printPersonsFromCity(String city) {
        for (Person p : persons) {
            boolean condition = p.getCity().equals(city);
            if (condition) {
                System.out.println(p);
            }
        }
    }
    
    public void printPersonOrderByName(){
        Collections.sort(persons);
        for(Person person : persons){
            System.out.println(person);
        }
    }
}
