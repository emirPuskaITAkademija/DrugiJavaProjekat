package six.student;

import six.Person;

public class Student extends Person {

    private int indexNumber;

    public Student(String param1, String surname, int indexNumber) {
        super(param1, surname);
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void printStudentInfo() {
        System.out.println("Name = " + name + ", Surname = " + surname + ", indeks = " + indexNumber);
    }
}
