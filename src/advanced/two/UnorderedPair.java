package advanced.two;

//BOUNDED generic type
public class UnorderedPair<K2 extends Number, V2> implements Pair<K2, V2> {

    private final K2 key;
    private final V2 value;

    //DI-
    public UnorderedPair(K2 key, V2 value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K2 getKey() {
        return key;
    }

    @Override
    public V2 getValue() {
        return value;
    }
}
