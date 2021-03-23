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

    public Skills(Character character) {
        this.character = character;
    }

    //might must be moved
    public int BasicSkillCostPerCaste(Caste caste){
        switch (caste){
            case PRIEST:
                return 8;
            case THIEF:
            case WITCH:
                return 10;
            case DUELER:
            case FIRE_MAGE:
                return 11;
            case WARRIOR:
            case PSY_MASTER:
            case ILLUSIONIST:
            case WITCH_MASTER:
                return 12;
            case GLADIATOR:
            case HEADHUNTER:
            case BARD:
                return 13;
            case AMAZON:
            case BARBARIAN:
            case WIZARD:
                return 14;
            case PALADIN:
            case MARTIAL_ARTIST:
            case SWORD_ARTIST:
                return 15;
            case KNIGHT:
                return 16;
            default:
                return 0;
        }
    }
}
