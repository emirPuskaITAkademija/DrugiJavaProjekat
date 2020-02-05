package advanced.four;

public class DividerTester {
    public static void main(String[] args) {
        Divider divider = new Divider(3.9);
        double result = divider.divideBy(0);
        System.out.println(result);
    }
}
