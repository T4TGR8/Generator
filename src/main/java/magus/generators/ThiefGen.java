package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;
import magus.modifiers.combatstatmods.CombatPointModifiers;

public class ThiefGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public ThiefGen(Character character) {
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
                character.setXpForNextLevel(101);
                break;
            case 2:
                character.setExperiencePoint(101);
                character.setXpForNextLevel(102);
                break;
            case 3:
                character.setExperiencePoint(203);
                character.setXpForNextLevel(198);
                break;
            case 4:
                character.setExperiencePoint(401);
                character.setXpForNextLevel(402);
                break;
            case 5:
                character.setExperiencePoint(803);
                character.setXpForNextLevel(898);
                break;
            case 6:
                character.setExperiencePoint(1701);
                character.setXpForNextLevel(2800);
                break;
            case 7:
                character.setExperiencePoint(4501);
                character.setXpForNextLevel(4500);
                break;
            case 8:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(13000);
                break;
            case 9:
                character.setExperiencePoint(22001);
                character.setXpForNextLevel(24500);
                break;
            case 10:
                character.setExperiencePoint(46501);
                character.setXpForNextLevel(22000);
                break;
            case 11:
                character.setExperiencePoint(68501);
                character.setXpForNextLevel(29500);
                break;
            case 12:
                character.setExperiencePoint(98001);
                character.setXpForNextLevel(33500);
                break;

            default:
                character.setExperiencePoint(131501 + ((character.getLevel() - 13) * 33500));
                character.setXpForNextLevel(33500);
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

    @Override
    public int painResistancePontForXP() { return 25; }

    CombatPointModifiers combatPointModifiers = new CombatPointModifiers();

    @Override
    public int[] weaponTypeMidifiers(int combatModifier) {
        return combatPointModifiers.rangerModifier(combatModifier);
    }
}
