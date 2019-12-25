package six;

public class SixExecutor {

    public static void main(String[] args) {
        //TIP VARIJABLA = VRIJEDNOST;
        //TIPOVE :
        // 1. Prosti -> byte, short, int, long, float, double, boolean, char
        int number = 23;
        number = 34;
        //2. Složene ili objektne
        int[] numbers = new int[4];
        numbers[0] = 23;
        numbers[1] = 34;
        //OGRANIČENJA
        //svi unutar niza moraju biti istog tipa
        //fiksna duzina niza
        //Person.counter = 3;
        Person p1 = new Person("Almir", "Mustafić");
        System.out.println(p1.name + " " + p1.surname);// Almir Mustafić
        Person.printCounter();
        //System.out.println("COUNTER = " + p1.counter);// COUNTER = 1
        Person p2 = new Person("Adnan", "Husika");
        System.out.println(p2.name + " " + p2.surname);// Adnan Husika
        // System.out.println("COUNTER = " + p1.counter);//COUNTER = 2" 1 // 2, 2, 2
        Person.printCounter();
        // System.out.println("COUNTER = " + p2.counter);//COUNTER = 2" 1 // 3, 2,
        Person.printCounter();
        Person p3 = new Person("Džena", "Nikšić");
        //System.out.println("COUNTER = " + p1.pr);//ALMIR p1 = 3
        Person.printCounter();
        Person.printCounter();
        Person.printCounter();
        //System.out.println("COUNTER = " + p2.counter);//ADNAN p2 = 3
        //System.out.println("COUNTER = " + p3.counter);//DŽENA p3 = 3
        Person p4 = new Person("Amela", "Kurtic", 17);
        Person p5 = new Person("Alema", 1000.0);
        System.out.println("ALEMA PREZIME = " + p5.surname);
        Person p6 = new Person("Jasmina", 16);

    }
}
