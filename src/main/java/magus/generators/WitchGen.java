package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class WitchGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public WitchGen(Character character) {
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
                character.setXpForNextLevel(151);
                break;
            case 2:
                character.setExperiencePoint(151);
                character.setXpForNextLevel(150);
                break;
            case 3:
                character.setExperiencePoint(301);
                character.setXpForNextLevel(300);
                break;
            case 4:
                character.setExperiencePoint(601);
                character.setXpForNextLevel(400);
                break;
            case 5:
                character.setExperiencePoint(1001);
                character.setXpForNextLevel(1000);
                break;
            case 6:
                character.setExperiencePoint(2001);
                character.setXpForNextLevel(2000);
                break;
            case 7:
                character.setExperiencePoint(4001);
                character.setXpForNextLevel(5000);
                break;
            case 8:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(8000);
                break;
            case 9:
                character.setExperiencePoint(17001);
                character.setXpForNextLevel(21500);
                break;
            case 10:
                character.setExperiencePoint(38501);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(58501);
                character.setXpForNextLevel(20000);
                break;
            case 12:
                character.setExperiencePoint(785001);
                character.setXpForNextLevel(30000);
                break;

            default:
                character.setExperiencePoint(108501 + ((character.getLevel() - 13) * 31500));
                character.setXpForNextLevel(31500);
                break;
        }
    }

    @Override
    public void setPsySchool(Psy psy) {
        psy.setPsySchool(PsySchool.NINCS);
    }

    @Override
    public void setBasePsyPoint(Psy psy) {
        psy.setBasePsyPoint(0);
    }

    @Override
    public void setUsageGrade(Psy psy) {
        psy.setUsageGrade(0);
    }

    @Override
    public void setPsyPointPerLevel(Psy psy) {
        psy.setPsyPointPerLevel(0);
    }

    @Override
    public void setMaxPsyPointPerLevel(Psy psy) {
        psy.setMaxPsyPointPerLevel(0);
    }

    @Override
    public void setXpPerPsyPoint(Psy psy) {
        psy.setXpPerPsyPoint(0);
    }
}
