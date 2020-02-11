package konsultacije;

public enum Gender {
    
    
    MALE("Muski spol"), FEMALE("Zenski spol"), TRANS("Ne znamo šta je");
    
    
    private String description;

    private Gender(String polje) {
        this.description = polje;
    }

    public String getDescription() {
        return description;
    }
    
    
}
