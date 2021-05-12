package magus.model;

public class Psy {
    int id;
    PsySchool psySchool;
    int usageGrade; // használat foka
    int usageLevel; // használat szintje
    int basePsyPoint;
    int psyPointPerLevel;
    int maxPsyPointPerLevel;
    int xpPerPsyPoint;
    int psyPoints; //max pszi pont

    int staticAstralMagicShield;
    int staticMentalMagicShield;
    int dynamicAstralMagicShield;
    int dynamicMentalMagicShield;
    int miscAstralMagicShield;
    int miscMentalMagicShield;
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

    public int getBasePsyPoint() {
        return basePsyPoint;
    }

    public void setBasePsyPoint(int basePsyPoint) {
        this.basePsyPoint = basePsyPoint;
    }

    public int getPsyPointPerLevel() {
        return psyPointPerLevel;
    }

    public void setPsyPointPerLevel(int psyPointPerLevel) {
        this.psyPointPerLevel = psyPointPerLevel;
    }

    public int getMaxPsyPointPerLevel() {
        return maxPsyPointPerLevel;
    }

    public void setMaxPsyPointPerLevel(int maxPsyPointPerLevel) {
        this.maxPsyPointPerLevel = maxPsyPointPerLevel;
    }

    public int getXpPerPsyPoint() {
        return xpPerPsyPoint;
    }

    public void setXpPerPsyPoint(int xpPerPsyPoint) {
        this.xpPerPsyPoint = xpPerPsyPoint;
    }

    public int getPsyPoints() {
        return psyPoints;
    }

    public void setPsyPoints(int psyPoints) {
        this.psyPoints = psyPoints;
    }

    public int getStaticAstralMagicShield() {
        return staticAstralMagicShield;
    }

    public void setStaticAstralMagicShield(int staticAstralMagicShield) {
        this.staticAstralMagicShield = staticAstralMagicShield;
    }

    public int getStaticMentalMagicShield() {
        return staticMentalMagicShield;
    }

    public void setStaticMentalMagicShield(int staticMentalMagicShield) {
        this.staticMentalMagicShield = staticMentalMagicShield;
    }

    public int getDynamicAstralMagicShield() {
        return dynamicAstralMagicShield;
    }

    public void setDynamicAstralMagicShield(int dynamicAstralMagicShield) {
        this.dynamicAstralMagicShield = dynamicAstralMagicShield;
    }

    public int getDynamicMentalMagicShield() {
        return dynamicMentalMagicShield;
    }

    public void setDynamicMentalMagicShield(int dynamicMentalMagicShield) {
        this.dynamicMentalMagicShield = dynamicMentalMagicShield;
    }

    public int getMiscAstralMagicShield() {
        return miscAstralMagicShield;
    }

    public void setMiscAstralMagicShield(int miscAstralMagicShield) {
        this.miscAstralMagicShield = miscAstralMagicShield;
    }

    public int getMiscMentalMagicShield() {
        return miscMentalMagicShield;
    }

    public void setMiscMentalMagicShield(int miscMentalMagicShield) {
        this.miscMentalMagicShield = miscMentalMagicShield;
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

    public Psy() {
    }

    public Psy(Character character) {
        this.character = character;
    }
}
