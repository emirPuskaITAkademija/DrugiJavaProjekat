package advanced.five;

//1.8 Java uvodi mogućnost kreiranja objekata tipa funkcionalnog interfejsa bez operatora new
// LAMBDA operator  -> 
public class Executor {

    public static void main(String[] args) {
        Person person = new Person(0, "", "", "", "");

        PersonTester personTester = new PersonTester() {
            @Override
            public boolean test(Person p) {
                return p.getAddress().equals("Zenica");
            }
        };
        PersonTester personTester1 = p -> {
            boolean result = p.getCity().equals("zenica");
            return result;
        };
        personTester.test(person);
    }
}
