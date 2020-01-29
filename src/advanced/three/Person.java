package advanced.three;

//Outer klasa: public i paketno-privatni
import java.time.LocalDate;
//ALT+Shift+F

public class Person {

    public static int counter = 0;
    private final int id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;

    public Person(int id, String name, String surname, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(surname);
        sb.append(", birthday: ");
        sb.append(birthday.toString());
       // String textRepresentPerson = name + " " + surname + ", birthday: " + birthday.toString();
        return sb.toString();
    }

}
