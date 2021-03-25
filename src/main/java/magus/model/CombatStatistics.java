package magus.model;

public class CombatStatistics {
    int id;

    int baseInitiativePoints;
    int initiativePoints;

    int baseAttackPoints;
    int attackPoints;

    int baseDefensePoints;
    int defensePoints;

    int baseAimingPoints;
    int aimingPoints;

    int combatModifierPerLevel;

    Character character;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInitiativePoints() {
        return initiativePoints;
    }

    public void setInitiativePoints(int initiativePoints) {
        this.initiativePoints = initiativePoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getAimingPoints() {
        return aimingPoints;
    }

    public void setAimingPoints(int aimingPoints) {
        this.aimingPoints = aimingPoints;
    }

    public int getCombatModifierPerLevel() {
        return combatModifierPerLevel;
    }

    public void setCombatModifierPerLevel(int combatModifierPerLevel) {
        this.combatModifierPerLevel = combatModifierPerLevel;
    }

    public int getBaseInitiativePoints() {
        return baseInitiativePoints;
    }

    public void setBaseInitiativePoints(int baseInitiativePoints) {
        this.baseInitiativePoints = baseInitiativePoints;
    }

    public int getBaseAttackPoints() {
        return baseAttackPoints;
    }

    public void setBaseAttackPoints(int baseAttackPoints) {
        this.baseAttackPoints = baseAttackPoints;
    }

    public int getBaseDefensePoints() {
        return baseDefensePoints;
    }

    public void setBaseDefensePoints(int baseDefensePoints) {
        this.baseDefensePoints = baseDefensePoints;
    }

    public int getBaseAimingPoints() {
        return baseAimingPoints;
    }

    public void setBaseAimingPoints(int baseAimingPoints) {
        this.baseAimingPoints = baseAimingPoints;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public CombatStatistics() {
    }

    public CombatStatistics(Character character) {
        this.character = character;
    }
}
