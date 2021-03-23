package magus.model;

public enum Personality {
    LIFE ("Élet"),
    LIFE_CHAOS ("Élet, Káosz"),
    LIFE_ORDER ("Élet, Rend"),

    DEATH ("Halál"),
    DEATH_CHAOS ("Halál, Káosz"),
    DEATH_ORDER ("Halál, Rend"),

    CHAOS ("Káosz"),
    CHAOS_LIFE ("Káosz, Élet"),
    CHAOS_DEATH ("Káosz, Halál"),

    ORDER ("Rend"),
    ORDER_LIFE("Rend, Élet"),
    ORDER_DEATH ("Rend, Halál"),

    NEUTRAL ("Semleges");

    private final String personalityString;

    Personality(String personalityString){
        this.personalityString = personalityString;
    }

    public String getPersonalityString() {
        return personalityString;
    }

    public static Personality getPersonalityByString(String personality ){
        for ( Personality p : values() ){
            if (p.getPersonalityString().equals(personality)){
                return p;
            }
        }

        return null;
    }
}
