/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six.student;

import java.util.Arrays;
import java.util.stream.Stream;
import six.Person;
import six.teacher.Teacher;

public class StudentExecutor {
    
    public static void main(String[] args) {
        Student s1 = new Student("Elmedin", "Bešlagić", 15055);
        //s1.printStudentInfo();
        Teacher t1 = new Teacher("Almir", "Mustafić", "Programming in Java");
        //t1.printTeacherInfo();
        Person[] personArray = new Person[3];
        personArray[0] = s1; // Object Student Person   
        personArray[1] = t1; // Object Teacher Person
        personArray[2] = new Person("Tarik", "Pozder");// Object Person
        System.out.println("C++");
        //C++ 
        for (int i = 0; i < personArray.length; i++) {
            Person mutant = personArray[i];
            printPersonInfo(mutant);
        }
        //Java <=1.7
        System.out.println("JAVA Enhanced");
        for (Person mutant : personArray) {
            printPersonInfo(mutant);
        }
        System.out.println("Java 8 STYLE");
        //Java 1.8
        Stream.of(personArray).forEach(mutant -> printPersonInfo(mutant));
    }
    
    private static void printPersonInfo(Person p) {
        String ime = p.getName();
        String prezime = p.dohvatiPrezime();
        System.out.println("Name = " + ime + " Surname = " + prezime);
    }
}
