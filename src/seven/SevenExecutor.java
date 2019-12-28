package seven;

//tip(Person) ime_varijable(kenanMandzo) = vrijednost;
public class SevenExecutor {

    public static void main(String[] args) {
        //proste tipove
        char slovo = 'a';
        slovo = 'b';
        //složene tipove 
        char[] slova = new char[3];
        slova[0] = 'a';
        slova[1] = 'b';
        Person kenanMandzo = new Person("Kenan", "Mandzo");
        SevenExecutor sevenExecutorObject = new SevenExecutor();
        sevenExecutorObject.printPerson(kenanMandzo);//kenan mandzo counter = 1
        Person alemaMurtic = new Person("Alema", "Murtic");
        sevenExecutorObject.printPerson(alemaMurtic);//alema murtic counter = 2
        sevenExecutorObject.printPerson(kenanMandzo);//kenan mandzo counter = 2
        Person ivana = new Person("Ivana", "Šuligoj");
        sevenExecutorObject.printPerson(kenanMandzo);//kenan mandzo counter = 3
        sevenExecutorObject.printPerson(alemaMurtic);//alema murtic counter = 3
        sevenExecutorObject.printPerson(ivana);//ivana šuligoj counter = 3 
        
    }

    void printPerson(Person p) {
        String ime = p.getName();//ime objekta . ime funkcije
        String prezime = p.getSurname();
        System.out.println("Ime: " + ime + ", Prezime: " + prezime);
        Person.printCounter(p);//ime klase . ime funkcije
    }
}
