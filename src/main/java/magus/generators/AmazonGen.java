package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;

public class AmazonGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public AmazonGen(Character character) {
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
                character.setXpForNextLevel(186);
                break;
            case 2:
                character.setExperiencePoint(186);
                character.setXpForNextLevel(187);
                break;
            case 3:
                character.setExperiencePoint(373);
                character.setXpForNextLevel(372);
                break;
            case 4:
                character.setExperiencePoint(745);
                character.setXpForNextLevel(744);
                break;
            case 5:
                character.setExperiencePoint(1489);
                character.setXpForNextLevel(1488);
                break;
            case 6:
                character.setExperiencePoint(2977);
                character.setXpForNextLevel(2976);
                break;
            case 7:
                character.setExperiencePoint(5953);
                character.setXpForNextLevel(5948);
                break;
            case 8:
                character.setExperiencePoint(11901);
                character.setXpForNextLevel(11900);
                break;
            case 9:
                character.setExperiencePoint(23801);
                character.setXpForNextLevel(23800);
                break;
            case 10:
                character.setExperiencePoint(47601);
                character.setXpForNextLevel(23800);
                break;
            case 11:
                character.setExperiencePoint(71401);
                character.setXpForNextLevel(29600);
                break;
            case 12:
                character.setExperiencePoint(101001);
                character.setXpForNextLevel(50000);
                break;

            default:
                character.setExperiencePoint(151001 + ((character.getLevel() - 13) * 40500));
                character.setXpForNextLevel(40500);
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
