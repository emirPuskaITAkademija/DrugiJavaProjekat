package seven;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Renault 4";
        passByReference(car);
        System.out.println(car.model);
        System.out.println("TEST pass by value");
        int n1 = 500;
        System.out.println(n1);
        passByValue(n1);
        System.out.println(n1);
    }
    
    static void passByValue(int number){
        System.out.println(number);
        number = 1000;
        System.out.println(number);
    }
    
    static void passByReference(Car c){
        System.out.println(c.model);
        c.model = "Beetle";
        System.out.println(c.model);
    }
}
