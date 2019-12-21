package five;
//TIP IME_VARIJABLE = VRIJEDNOST;

public class ObjectOrientedExecutor {

    public static void main(String[] args) {
        //1. Prost(primitivni) tip
        int number = 23;
        number = 34;
        //2. Složeni(Objektni) tip
        int[] numbers = new int[3];
        numbers[0] = 34;
        numbers[1] = 23;
        Person p1 = new Person();

        p1.name = "Adnan";
        p1.surname = "Husika";
        p1.age = 31;
        p1.bankAccountAmount = 100000.0;

        Person p2 = new Person();
        p2.name = "Ivana";
        p2.surname = "Šuligoj";
        p2.age = 18;
        p2.bankAccountAmount = 1_000_000_000.0;

        String text = new String("Neka vrijednost").intern();
        String text1 = "Neka vrijednost";
        boolean poredjenje = text == text1;
        System.out.println(poredjenje);

    }
}
