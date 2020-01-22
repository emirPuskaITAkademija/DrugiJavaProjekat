package advanced.one.person;

public class Box<T> {
    private T polje;

    public Box(T polje) {
        this.polje = polje;
    }

    public T getPolje() {
        return polje;
    }
}
