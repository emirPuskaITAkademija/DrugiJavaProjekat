package eight;

public enum Gender {
    MALE("Muški"),//new Gender() 

    FEMALE("Ženski"), TRANS("Avlijaner");

    private String name;

     private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printObjects(){
       Gender[] objects =  Gender.values();
       for(Gender mutant : objects){
           System.out.println(mutant.getName());
       }
    }
}
