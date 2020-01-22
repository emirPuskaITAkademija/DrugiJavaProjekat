package advanced.two;
//KOncepti OO programming
//1. apstrakcija
//2. enkapsulacija
//3. nasljeđivanje
//4. polimorfizam

//Klasa može u svojoj definiciji posjedovati
//1. polja
//2. konstruktor
//3. funkcije ili metode
//4. ugniježdene definicije drugih klasa
public class TwoExecutor {
    public static void main(String[] args) {
        ShadowTest shadowTest = new ShadowTest();
        System.out.println(shadowTest.x);//imeObjekta.x
        System.out.println(ShadowTest.counter);//ImeKlase.counter
        //kreiranje objekta po šablonu NEstatičke Inner klase
       // ShadowTest.FirstLevel firstLevelObject = shadowTest.new FirstLevel();
 
        //kreiranje objekta po šablonu STATIČKE Inner klase
        ShadowTest.StaticFirstLevel staticFirstLevel = new ShadowTest.StaticFirstLevel();
        
        //POZIV funkcije printX
        //firstLevelObject.printX(23);
    }
}
