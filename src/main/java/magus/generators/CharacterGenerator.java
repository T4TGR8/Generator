package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.*;
import magus.model.Character;

import java.util.Random;

public abstract class CharacterGenerator {

    public static Random rnd = new Random();

    Character character;

    private int characterCreationPoints = 182; // -60 attribs  -92 combatStats  -19 HP PRP  -9 SP  -13 BS

    public void spendCharacterCreationPoints() {
        try {

            spendBasePoints();
            spendCharacterSpecPoints();

        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
    }

    public Character getCharacter() {
        return character;
    }

    private void spendBasePoints() throws InvalidAttributeException {
        Attributes atr = character.getAttributes();
        atr.setStrength(6);
        atr.setDexterity(6);
        atr.setQuickness(6);
        atr.setEndurance(6);
        atr.setHealth(6);
        atr.setBeauty(6);
        atr.setWill(6);
        atr.setIntelligence(6);
        atr.setAstral(6);
        atr.setPerception(6);

        CombatStatistics stat = character.getStatistics();
        stat.setBaseInitiativePoints(5);
        stat.setBaseAttackPoints(10);
        stat.setBaseDefensePoints(65);
        stat.setBaseAimingPoints(0);
        stat.setCombatModifierPerLevel(4);

        HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
        HPAndPain.setBaseHealthPoints(3);
        HPAndPain.setBasePainResistancePoints(4);
        HPAndPain.setPainResistancePointsPerLevel(3);

        Skills skills = character.getSkills();
        skills.setBaseSkillPoints(3);
        skills.setSkillPointsPerLevel(3);
    }

    public abstract void spendCharacterSpecPoints();

    public CharacterGenerator(Character character) {
        this.character = character;
    }
}
