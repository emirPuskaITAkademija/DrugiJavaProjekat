package konsultacije;
//1. Person
//atribute -> id, name, surname, birthday, gender
//definisati konstruktor koji ce ubaciti vrijednosti u polja

import java.time.LocalDate;
import java.util.Objects;

//POJO, entitet, Java bean
public class Person implements Comparable<Person> {

    private final int id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;
    private final Gender gender;

    public Person(int id, String name, String surname, LocalDate birthday, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person comparedObject = (Person) obj;
        boolean equalId = this.id == comparedObject.getId();
        boolean equalName = this.name.equals(comparedObject.getName());
        return equalId && equalName;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name);//varargs
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(":");
        sb.append(name);
        sb.append("  ");
        sb.append(surname);
        sb.append(" ->");
        sb.append(birthday.toString());
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        if (this.id == o.getId()) {
            return 0;
        }
        return this.id < o.getId() ? -1 : 1;
    }

}
