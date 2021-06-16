package magus.model;

public class Skills {
    int id;

    int baseSkillPoints;
    int skillPointsPerLevel;
    int skillPoints;

    Character character;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseSkillPoints() {
        return baseSkillPoints;
    }

    public void setBaseSkillPoints(int baseSkillPoints) {
        this.baseSkillPoints = baseSkillPoints;
    }

    public int getSkillPointsPerLevel() {
        return skillPointsPerLevel;
    }

    public void setSkillPointsPerLevel(int skillPointsPerLevel) {
        this.skillPointsPerLevel = skillPointsPerLevel;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Skills() {
    }

    public Skills(Character character) {
        this.character = character;
    }

}
