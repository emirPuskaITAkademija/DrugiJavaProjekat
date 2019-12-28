/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

public class InheritanceTest {
    public static void main(String[] args) {
        //p1 tipa Person, Object
        Person p1 = new Person("Lejla", "Smailagić");
        //s1 je tipa Person, Object i Student
        Person s1 = new Student("Elmedin", "Bešlagić", "12345");
        //t1 Object, Person, Teacher
        Teacher t1 = new Teacher("Admir", "Ćenanović", "Programming in Java");
        processPersons(p1, s1, t1);
        Car car = new Car();
        System.out.println("Polimorfizam");
        System.out.println(p1.toString());
        System.out.println(car.toString());
    }
    
    //niz persons je dug length = 3
    //0 -> i = 0 -> p1
    //i = 1 -> s1
    //i = 2 -> t1
    static void processPersons(Person... persons){
        for(int i=0; i<persons.length; i++){
            Person p = persons[i];
            processPerson(p);
        }
    }
    
    static void processPerson(Person person){
        String personName = person.getName();
        if(person instanceof Teacher){
            System.out.println(personName + " ->> Ja sam PROFA");
        }else if(person instanceof Student){
            System.out.println(personName + " ->> Ja sam STUDENT");
        }else{
            System.out.println(personName + " ->> Ja sam PERSONA");
        }
    }
    
}
