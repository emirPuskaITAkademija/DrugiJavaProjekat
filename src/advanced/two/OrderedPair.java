package advanced.two;
//K,V 

public class OrderedPair<K1, V1> implements Pair<K1, V1> {

    private final K1 key;
    private final V1 value;

    //DI - Depenndency Injection
    public OrderedPair(K1 key, V1 value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K1 getKey() {
        return key;
    }

    @Override
    public V1 getValue() {
        return value;
    }
}
