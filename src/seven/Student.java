package seven;

public class Student extends Person {

    private String indexNumber;

    public Student(String name, String surname, String indexNumber) {
        super(name, surname);
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

}
