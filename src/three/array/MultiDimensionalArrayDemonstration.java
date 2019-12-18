package three.array;

public class MultiDimensionalArrayDemonstration {

    public static void main(String[] args) {
        String[][] matrica = new String[3][2];
        String[][] nameSurnameArray = {
            {"Osman", "Bućan"},//0 -> niz
            {"Adnan", "Husika"},//1 -> nizovnog tipa
            {"Mirza", "Sitnić"},
            {"Alain", "Alper", "Soškur"}, 
            {"Hamid"}
        };
        System.out.println(nameSurnameArray[0][0] + " " + nameSurnameArray[0][1]);
        System.out.println(nameSurnameArray[3][0]+" " + nameSurnameArray[3][1]+" "+nameSurnameArray[3][2]);
        String[] array = nameSurnameArray[4];
        System.out.println(nameSurnameArray.length);
    }
}
