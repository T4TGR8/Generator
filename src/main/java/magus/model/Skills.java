package magus.model;

public class Skills {
    int id;
    int baseSkillPoints;
    int skillPointsPerLevel;
    int skillPoints;

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

    public Skills() {
    }
}
