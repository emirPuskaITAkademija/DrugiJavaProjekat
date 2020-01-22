package advanced.two;
//zamjena za T -> kad ćemo skontati šta je ovo T ???
// odgovor: u momentu kreiranja objekta tipa Box
// može li biti sve zamjena za ovo T ??
//odgovor: T Person, String, Integer, int(NE)
//zamjena za ovo T može biti objektni tip
//zamjena za ovo T ne može biti int, byte, float, char, ...8 prostih 
public class Box<T> {

    private T object;

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }

}
