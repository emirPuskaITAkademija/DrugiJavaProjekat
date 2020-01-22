package advanced.two;

import seven.Person;

public class PairUser {

    public static void main(String[] args) throws Exception{
        Integer kljuc = 0;
        Person vrijednost = new Person("Alein", "Alper");
        //K1, V1 do kraja života objekta koji se zove pair1 ne moramo nigdje raditi zamjenu za K1 i V1
        Pair<Integer, Person> pair1 = new OrderedPair<>(kljuc, vrijednost);
        Person p = pair1.getValue();//null
        String personName = p.getName();//null.getName();
        System.out.println(p);
        String vrijednost1 = "2";
        Integer number = Integer.parseInt(vrijednost1);
        Double doubleNumber;
        
        Pair<Person, Person> pair2 = new OrderedPair<>(new Person("Brad", "Pit"), new Person("Pit", "Sampras"));
        Double kljuc1= 1.0;
        Pair<Double, Person> pair3 = new UnorderedPair<>(kljuc1, new Person("Angeline", "Jolie"));
        Pair<Integer, Person> pair4 = new UnorderedPair<>(kljuc, new Person("Brad", "Pit"));
        
        //Util
        Person p1 = new Person("Almir", "Bešlagić");
        Person p2 = new Person("Almir", "Bešlagić");
        //1.7 TYPE inference 
        boolean equality = Util.<Person, Person>compare(p1, p2);
        System.out.println(equality);
        //1.8
        boolean equality1 = Util.compare(p1, p2);
    }
}
