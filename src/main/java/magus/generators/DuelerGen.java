package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class DuelerGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public DuelerGen(Character character) {
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
                character.setXpForNextLevel(166);
                break;
            case 2:
                character.setExperiencePoint(166);
                character.setXpForNextLevel(160);
                break;
            case 3:
                character.setExperiencePoint(331);
                character.setXpForNextLevel(330);
                break;
            case 4:
                character.setExperiencePoint(661);
                character.setXpForNextLevel(825);
                break;
            case 5:
                character.setExperiencePoint(1486);
                character.setXpForNextLevel(1415);
                break;
            case 6:
                character.setExperiencePoint(2901);
                character.setXpForNextLevel(2900);
                break;
            case 7:
                character.setExperiencePoint(5801);
                character.setXpForNextLevel(5200);
                break;
            case 8:
                character.setExperiencePoint(11001);
                character.setXpForNextLevel(11000);
                break;
            case 9:
                character.setExperiencePoint(22001);
                character.setXpForNextLevel(23000);
                break;
            case 10:
                character.setExperiencePoint(45001);
                character.setXpForNextLevel(22000);
                break;
            case 11:
                character.setExperiencePoint(67001);
                character.setXpForNextLevel(23000);
                break;
            case 12:
                character.setExperiencePoint(90001);
                character.setXpForNextLevel(46000);
                break;

            default:
                character.setExperiencePoint(136001 + ((character.getLevel() - 13) * 40000));
                character.setXpForNextLevel(40000);
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
