package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class KnightGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public KnightGen(Character character) {
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
                character.setXpForNextLevel(181);
                break;
            case 2:
                character.setExperiencePoint(181);
                character.setXpForNextLevel(190);
                break;
            case 3:
                character.setExperiencePoint(371);
                character.setXpForNextLevel(430);
                break;
            case 4:
                character.setExperiencePoint(801);
                character.setXpForNextLevel(850);
                break;
            case 5:
                character.setExperiencePoint(1651);
                character.setXpForNextLevel(1550);
                break;
            case 6:
                character.setExperiencePoint(3201);
                character.setXpForNextLevel(3200);
                break;
            case 7:
                character.setExperiencePoint(6401);
                character.setXpForNextLevel(5600);
                break;
            case 8:
                character.setExperiencePoint(12001);
                character.setXpForNextLevel(13000);
                break;
            case 9:
                character.setExperiencePoint(25001);
                character.setXpForNextLevel(20000);
                break;
            case 10:
                character.setExperiencePoint(45001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(65001);
                character.setXpForNextLevel(25000);
                break;
            case 12:
                character.setExperiencePoint(90001);
                character.setXpForNextLevel(20000);
                break;

            default:
                character.setExperiencePoint(110001 + ((character.getLevel() - 13) * 35000));
                character.setXpForNextLevel(35000);
                break;
        }
    }

}
