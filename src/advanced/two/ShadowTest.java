package advanced.two;
//Klasa može u svojoj definiciji posjedovati
//1. polja 
    //1.1. objektna
    //1.2 static
//2. konstruktor
//3. funkcije ili metode
    //3.1 objektne 
    //3.2 static
//4. ugniježdene definicije drugih klasa INNER
    //4.1 objektne
    //4.2 static

//OUTER klasa - public, paketno-privatni(bez kljucne rijeci)
class ShadowTest {
    public static int counter = 0;//staticko -> ImeKlase.counter
    public int x = 0;//objektno -> imeObjekta.x

    public ShadowTest() {
        counter++;
    } 
    
    public Object createFirsLevelObject(){
        FirstLevel firstLevelObject = this.new FirstLevel();
        return firstLevelObject;
    }
    
    //INNER klase -> public, protected, private i package-private
    private class FirstLevel{
        public int x = 1;
        
        public void printX(int x){
            System.out.println("x = " + x);// 23
            System.out.println("this.x = " + this.x );// 1
            System.out.println("ShadowTest.x = " + ShadowTest.this.x);//0
        }
    }
    
    //STATIC INNER klasa
    protected static class StaticFirstLevel{
        public int x = 2;
        
        public void printX(int x){
            System.out.println("x = " + x);
        }
    }
}
