package magus.model;

public class Psy {
    int id;
    PsySchool psySchool;
    int usageLevel;
    int usageGrade;
    int psyPoints;
    int astralMagicShield;
    int mentalMagicShield;

    Character character;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PsySchool getPsySchool() {
        return psySchool;
    }

    public void setPsySchool(PsySchool psySchool) {
        this.psySchool = psySchool;
    }

    public int getUsageLevel() {
        return usageLevel;
    }

    public void setUsageLevel(int usageLevel) {
        this.usageLevel = usageLevel;
    }

    public int getUsageGrade() {
        return usageGrade;
    }

    public void setUsageGrade(int usageGrade) {
        this.usageGrade = usageGrade;
    }

    public int getPsyPoints() {
        return psyPoints;
    }

    public void setPsyPoints(int psyPoints) {
        this.psyPoints = psyPoints;
    }

    public int getAstralMagicShield() {
        return astralMagicShield;
    }

    public void setAstralMagicShield(int astralMagicShield) {
        this.astralMagicShield = astralMagicShield;
    }

    public int getMentalMagicShield() {
        return mentalMagicShield;
    }

    public void setMentalMagicShield(int mentalMagicShield) {
        this.mentalMagicShield = mentalMagicShield;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Psy(Character character) {
        this.character = character;
    }
}
