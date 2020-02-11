package konsultacije;

public class GenderTester {
    public static void main(String[] args) {
                Gender gender1 = Gender.FEMALE;
        Gender gender2 = Gender.FEMALE;
        // == equals
        boolean daLiSuJednaki = gender1 == gender2;
        System.out.println(daLiSuJednaki);
        boolean daLiSuJednaki2 = gender1.equals(gender2);
        System.out.println(daLiSuJednaki2);
        Gender gender3 = Gender.TRANS;
        String gender3Description = gender3.getDescription();
        System.out.println(gender3Description);
    }
}
