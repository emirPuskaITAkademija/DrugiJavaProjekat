package eight;

public enum Season {
    //OBJEKTI
    SPRING(1, "Proljece"), //new Season(1, "Proljeće")
    SUMMER(2, "Ljeto"),
    AUTUMN(3, "Jesen"),
    WINTER(4, "Zima");

    private int redniBroj;
    private String imeGodisnjegDoba;

    private Season(int broj, String imeGodisnjegDoba) {
        this.redniBroj = broj;
        this.imeGodisnjegDoba = imeGodisnjegDoba;
    }

    public int dohvatiRedniBroj() {
        return redniBroj;
    }

    public String dohvatiImeGodisnjegDoba() {
        return imeGodisnjegDoba;
    }

    public static Season findSeasonByRedniBroj(int redniBroj) {
        Season[] seasons = Season.values();
        //enhanced for loop ili for/in
        Season season = null;
        for (int i = 0; i < seasons.length; i++) {
            Season mutant = seasons[i];
            int redniBrojMutanta = mutant.redniBroj;
            if (redniBrojMutanta == redniBroj) {
                season = mutant;
                break;
            }
        }
        return season;
    }

    public static Season findSeasonByName(String imeGodisnjegDoba) {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            String imeGodDoba = season.imeGodisnjegDoba.toLowerCase();
            if (imeGodisnjegDoba != null) {
                String korisnickoImeGodDoba = imeGodisnjegDoba.toLowerCase();
                if (imeGodDoba.equals(korisnickoImeGodDoba)) {
                    return season;
                }
            }
        }
        return null;
    }

}
