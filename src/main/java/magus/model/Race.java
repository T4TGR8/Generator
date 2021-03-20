package magus.model;

public enum Race {
    HUMAN ("Ember"),
    ELF ("Elf"),
    HALF_ELF ("Félelf"),
    ORC ("Ork"),
    DWARF ("Törpe"),
    DZSENN ("Dzsenn"),
    AMUND ("Amund"),
    KHAAL ("Khál"),
    WIER ("Wier"),
    GOBLIN ("Goblin"),
    GNOME ("Gnóm");

    private final String raceString;

    Race(String raceString) {
        this.raceString = raceString;
    }

    public String getRaceString() {
        return raceString;
    }
}
