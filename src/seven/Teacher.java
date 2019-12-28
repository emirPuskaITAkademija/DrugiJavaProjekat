package seven;

public class Teacher extends Person {

    private String areaOfTeaching;

    public Teacher(String name, String surname, String areaOfTeaching) {
        super(name, surname);
        this.areaOfTeaching = areaOfTeaching;
    }

    public String getAreaOfTeaching() {
        return areaOfTeaching;
    }

    
}
