package two;

public class TypoExecutor {
    public static void main(String[] args) {
        //26 
        int number = 26;//dekadni
        System.out.println(number);
        number = 0x1a;// 0x heksadecimalni
        System.out.println(number);
        number = 0b11_0_10;//0b binarni
        System.out.println(number);//
        number = 032;//0 oktalni
        System.out.println(number);
        
        long bankAccountNumber = 161_123;
    }
}
