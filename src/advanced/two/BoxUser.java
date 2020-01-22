package advanced.two;

import seven.abstraction.Circle;
import seven.abstraction.Rectangle;
import seven.abstraction.Shape;

public class BoxUser {

    public static void main(String[] args) {
        Box adnanovaKutija = new Box();
        adnanovaKutija.set("String");
        String polje = (String) adnanovaKutija.get();
        Box osmanovaKutija = new Box();
        osmanovaKutija.set(234);
        Integer osmanovoPolje = (Integer) osmanovaKutija.get();
        //new generation of Software developers
        //<=1.6
        Box<String> ivaninaKutija = new Box<String>();
        ivaninaKutija.set("Lejla");
        String ivaninoPolje = ivaninaKutija.get();
        //1.7 ARM, try-with-resource
        Box<Shape> aleminaKutija = new Box<>();//diamond
        Circle circle = new Circle(0, 0, 3.0);
        aleminaKutija.set(circle);
        Shape shape = aleminaKutija.get();
    }
}
