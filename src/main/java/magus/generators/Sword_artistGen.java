package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class Sword_artistGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public Sword_artistGen(Character character) {
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
                character.setXpForNextLevel(201);
                break;
            case 2:
                character.setExperiencePoint(201);
                character.setXpForNextLevel(200);
                break;
            case 3:
                character.setExperiencePoint(401);
                character.setXpForNextLevel(525);
                break;
            case 4:
                character.setExperiencePoint(926);
                character.setXpForNextLevel(975);
                break;
            case 5:
                character.setExperiencePoint(1901);
                character.setXpForNextLevel(2100);
                break;
            case 6:
                character.setExperiencePoint(4001);
                character.setXpForNextLevel(4250);
                break;
            case 7:
                character.setExperiencePoint(8251);
                character.setXpForNextLevel(7250);
                break;
            case 8:
                character.setExperiencePoint(15501);
                character.setXpForNextLevel(15500);
                break;
            case 9:
                character.setExperiencePoint(31001);
                character.setXpForNextLevel(31500);
                break;
            case 10:
                character.setExperiencePoint(62501);
                character.setXpForNextLevel(52500);
                break;
            case 11:
                character.setExperiencePoint(115001);
                character.setXpForNextLevel(50000);
                break;
            case 12:
                character.setExperiencePoint(165001);
                character.setXpForNextLevel(70000);
                break;

            default:
                character.setExperiencePoint(230001 + ((character.getLevel() - 13) * 62000));
                character.setXpForNextLevel(62000);
                break;
        }
    }

}
