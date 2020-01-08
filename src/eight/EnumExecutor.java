package eight;
public class EnumExecutor {

    public static void main(String[] args) {
        Person person = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Animal animal = new Animal("Vodozemci");
        WeekDay monday = new WeekDay(0, "Monday");
        WeekDay monday1 = new WeekDay(0, "Monday");
        
        Gender muski = Gender.MALE;
        System.out.println(muski.getName());
        
        System.out.println("Svi genderi");
        Gender.printObjects();
    }
}
