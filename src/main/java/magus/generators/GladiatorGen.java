package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;
import magus.modifiers.combatstatmods.CombatPointModifiers;

public class GladiatorGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public GladiatorGen(Character character) {
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
                character.setXpForNextLevel(189);
                break;
            case 2:
                character.setExperiencePoint(189);
                character.setXpForNextLevel(188);
                break;
            case 3:
                character.setExperiencePoint(377);
                character.setXpForNextLevel(449);
                break;
            case 4:
                character.setExperiencePoint(826);
                character.setXpForNextLevel(825);
                break;
            case 5:
                character.setExperiencePoint(1651);
                character.setXpForNextLevel(1650);
                break;
            case 6:
                character.setExperiencePoint(3301);
                character.setXpForNextLevel(3950);
                break;
            case 7:
                character.setExperiencePoint(7251);
                character.setXpForNextLevel(4800);
                break;
            case 8:
                character.setExperiencePoint(12051);
                character.setXpForNextLevel(11950);
                break;
            case 9:
                character.setExperiencePoint(24001);
                character.setXpForNextLevel(24000);
                break;
            case 10:
                character.setExperiencePoint(48001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(68001);
                character.setXpForNextLevel(25000);
                break;
            case 12:
                character.setExperiencePoint(93001);
                character.setXpForNextLevel(37000);
                break;

            default:
                character.setExperiencePoint(130001 + ((character.getLevel() - 13) * 40000));
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

    @Override
    public int painResistancePontForXP() { return 12; }

    CombatPointModifiers combatPointModifiers = new CombatPointModifiers();

    @Override
    public int[] weaponTypeMidifiers(int combatModifier) {
        return combatPointModifiers.meleeModifiers(combatModifier);
    }
}
