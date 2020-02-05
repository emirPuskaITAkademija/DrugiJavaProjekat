
package advanced.four;

public class Divider {
    private final double number;

    public Divider(double number) {
        this.number = number;
    }

    public double divideBy(double param){
        if(param<=0){
            throw new RuntimeException("Dijeljenje s nulom burazeru nema smisla");
        }
        double result = number/param;
        return result;
    }
    
}
