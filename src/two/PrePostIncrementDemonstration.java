package two;

//COnditional AND -> &&
//COnditional OR -> || 
public class PrePostIncrementDemonstration {

    public static void main(String[] args) {
        int a = 2, b = 3;
        int res = a * (b++) + b;//2*3+4
        System.out.println(res);
        b = 3;
        res = a * (++b) + b;// 2*4+4
        System.out.println(res);
        b = 2;
        res = a + a * b;
        System.out.println(res);// 2+2*2
    }
}
