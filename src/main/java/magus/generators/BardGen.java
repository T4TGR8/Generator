package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class BardGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public BardGen(Character character) {
        super(character);
    }

    @Override
    public int Kap() {
        return (375 - 180 - 12);
    }

    @Override
    public void spendBasePoints() throws InvalidAttributeException {

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

        stat.setBaseInitiativePoints(5);
        stat.setBaseAttackPoints(10);
        stat.setBaseDefensePoints(65);
        stat.setBaseAimingPoints(0);
        stat.setCombatModifierPerLevel(4);

        HPAndPain.setBaseHealthPoints(3);
        HPAndPain.setBasePainResistancePoints(4);
        HPAndPain.setPainResistancePointsPerLevel(3);

        skills.setBaseSkillPoints(3);
        skills.setSkillPointsPerLevel(3);
    }

    @Override
    public void calculateXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(170);
                break;
            case 2:
                character.setExperiencePoint(171);
                character.setXpForNextLevel(280);
                break;
            case 3:
                character.setExperiencePoint(351);
                character.setXpForNextLevel(650);
                break;
            case 4:
                character.setExperiencePoint(1001);
                character.setXpForNextLevel(1200);
                break;
            case 5:
                character.setExperiencePoint(2201);
                character.setXpForNextLevel(2200);
                break;
            case 6:
                character.setExperiencePoint(4401);
                character.setXpForNextLevel(3100);
                break;
            case 7:
                character.setExperiencePoint(7501);
                character.setXpForNextLevel(7500);
                break;
            case 8:
                character.setExperiencePoint(15001);
                character.setXpForNextLevel(15000);
                break;
            case 9:
                character.setExperiencePoint(30001);
                character.setXpForNextLevel(25000);
                break;
            case 10:
                character.setExperiencePoint(55001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(75001);
                character.setXpForNextLevel(20000);
                break;
            case 12:
                character.setExperiencePoint(95001);
                character.setXpForNextLevel(50000);
                break;

            default:
                character.setExperiencePoint(145001 + ((character.getLevel() - 13) * 40000));
                character.setXpForNextLevel(40000);
                break;
        }
    }

}
