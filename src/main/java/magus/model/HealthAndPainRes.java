package magus.model;

public class HealthAndPainRes {
    int id;

    int baseHealthPoints;
    int maxHealthPoints;
    int basePainResistancePoints;
    int maxPainResistancePoints;
    int painResistancePointsPerLevel;

    Character character;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseHealthPoints() {
        return baseHealthPoints;
    }

    public void setBaseHealthPoints(int baseHealthPoints) {
        this.baseHealthPoints = baseHealthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getBasePainResistancePoints() {
        return basePainResistancePoints;
    }

    public void setBasePainResistancePoints(int basePainResistancePoints) {
        this.basePainResistancePoints = basePainResistancePoints;
    }

    public int getMaxPainResistancePoints() {
        return maxPainResistancePoints;
    }

    public void setMaxPainResistancePoints(int maxPainResistancePoints) {
        this.maxPainResistancePoints = maxPainResistancePoints;
    }

    public int getPainResistancePointsPerLevel() {
        return painResistancePointsPerLevel;
    }

    public void setPainResistancePointsPerLevel(int painResistancePointsPerLevel) {
        this.painResistancePointsPerLevel = painResistancePointsPerLevel;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public HealthAndPainRes(Character character) {
        this.character = character;
    }
}
