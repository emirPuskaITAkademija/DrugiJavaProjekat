package eight;

//enum -> enumerated ili pobrojano mnogo objekata
public enum WeekDayEnum {
    MONDAY(1, "Monday"), //new WeekDayEnum(1, "Monday)
    TUESDAY(2, "Tuesday"), 
    WEDNESDAY(3, "Wednesday");
    
    
    
    //polja ili properties ili attributes ili fields 
    private int sequence;
    private String name;

    //konstruktor
    private WeekDayEnum(int sequence, String name) {
        this.sequence = sequence;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSequence() {
        return sequence;
    }
    
    
}
