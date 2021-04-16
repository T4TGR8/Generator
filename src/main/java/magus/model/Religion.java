package magus.model;

public enum Religion {
    DOMVIK("Domvik"),
    RANAGOL("Ranagol"),
    ADRON("Adron"),
    ALBORNE("Alborne"),
    ANTOH("Antoh"),
    AREL("Arel"),
    DARTON("Darton"),
    DELLA("Della"),
    DREINA("Dreina"),
    ELLANA("Ellana"),
    GILRON("Girlon"),
    KRAD("Krad"),
    KYEL("Kyel"),
    NOIR("Noir"),
    ORWELLA("Orwella"),
    UWEL("Uwel"),
    SOGRON("Sorgon"),
    THARR("Tharr");

    private final String religionString;

    Religion(String religionString) {
        this.religionString = religionString;
    }

    public String getReligionString() {
        return religionString;
    }

    public static Religion getReligionByString(String religion) {
        for (Religion r : values()) {
            if (r.getReligionString().equals(religion)) {
                return r;
            }
        }

        return null;
    }
}
