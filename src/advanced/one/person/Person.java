package advanced.one.person;

import java.time.LocalDate;
import java.time.Period;
//1. Proste
//2. Složene
// 2.1 složeni ili objektni
// 2.2 parametrizirani složeni odnosno oni postoje zahvaljujuć generičkim tipovima
public final class Person {

    //polja private
    private String name;
    private LocalDate birthday;
    private Gender gender;
    

    public Person(String name, LocalDate birthday, Gender gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        LocalDate now = LocalDate.now();
        //LocalDate, ChronoLocalDate -> now
        Period period = birthday.until(now);
        int age = period.getYears();
        return age;
    }
}
