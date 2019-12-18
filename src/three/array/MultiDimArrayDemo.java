package three.array;

public class MultiDimArrayDemo {

    public static void main(String[] args) {
        int[][] anArray = new int[3][3];
        anArray[0][0] = 23;
        anArray[0][1] = 234;
        anArray[0][2] = 123;
        anArray[1][1] = 13;
        anArray[2][2] = 234556;
        for(int i = 0; i<anArray.length; i++){
            for(int j = 0 ; j<anArray[i].length; j++){
                System.out.print(anArray[i][j]+",");
            }
            System.out.println("");
        }
    }
}
