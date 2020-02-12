package advanced.five;

public class Person implements Comparable<Person>{

    private final int id;
    private final String lastName;
    private final String firstName;
    private final String address;
    private final String city;

    public Person(int id, String lastName, String firstName, String address, String city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName);
        sb.append(",");
        sb.append(firstName);
        return sb.toString();
    }

    //p1
    // p1.compareTo(p2)
    //int -1 0 1
    @Override
    public int compareTo(Person o) {
        int result = this.firstName.compareTo(o.getFirstName());
        if(result == 0){
            result = this.lastName.compareTo(o.getLastName());
        }
        return result;
    }

    
    
}
