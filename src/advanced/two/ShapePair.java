package advanced.two;

import seven.abstraction.Shape;
//Dizajn princip: Kod koji kreirate koji dizajnirate treba da bude CLOSED for modification ali treba da bude OPEN for EXTENSIOn
//Klasa treba da ima samo jedan razlog za izmjenu
public class ShapePair<K extends Number, V extends Shape> implements Pair<K, V> {

    private K key;
    private V value;

    public ShapePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

}
