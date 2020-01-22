package advanced.two;
//Generički tipove
//1. UNBOUNDED generic type -> K, V -> bilo što što nasljeđuje java.lang.Object
//2. BOUNDED generic type
public interface Pair<K, V> {

    public K getKey();

    public V getValue();
}
