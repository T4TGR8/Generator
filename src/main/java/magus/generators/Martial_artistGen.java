package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class Martial_artistGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public Martial_artistGen(Character character) {
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
                character.setXpForNextLevel(221);
                break;
            case 2:
                character.setExperiencePoint(221);
                character.setXpForNextLevel(222);
                break;
            case 3:
                character.setExperiencePoint(443);
                character.setXpForNextLevel(508);
                break;
            case 4:
                character.setExperiencePoint(951);
                character.setXpForNextLevel(1050);
                break;
            case 5:
                character.setExperiencePoint(2001);
                character.setXpForNextLevel(2500);
                break;
            case 6:
                character.setExperiencePoint(4501);
                character.setXpForNextLevel(4500);
                break;
            case 7:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(7000);
                break;
            case 8:
                character.setExperiencePoint(16001);
                character.setXpForNextLevel(16000);
                break;
            case 9:
                character.setExperiencePoint(32001);
                character.setXpForNextLevel(33000);
                break;
            case 10:
                character.setExperiencePoint(65001);
                character.setXpForNextLevel(55000);
                break;
            case 11:
                character.setExperiencePoint(120001);
                character.setXpForNextLevel(50000);
                break;
            case 12:
                character.setExperiencePoint(170001);
                character.setXpForNextLevel(70000);
                break;

            default:
                character.setExperiencePoint(240001 + ((character.getLevel() - 13) * 65000));
                character.setXpForNextLevel(65000);
                break;
        }
    }

}
