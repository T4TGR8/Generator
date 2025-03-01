package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;
import magus.modifiers.combatstatmods.CombatPointModifiers;

public class WizardGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public WizardGen(Character character) {
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
                character.setXpForNextLevel(231);
                break;
            case 2:
                character.setExperiencePoint(231);
                character.setXpForNextLevel(270);
                break;
            case 3:
                character.setExperiencePoint(501);
                character.setXpForNextLevel(500);
                break;
            case 4:
                character.setExperiencePoint(1001);
                character.setXpForNextLevel(1200);
                break;
            case 5:
                character.setExperiencePoint(2201);
                character.setXpForNextLevel(2800);
                break;
            case 6:
                character.setExperiencePoint(5001);
                character.setXpForNextLevel(5000);
                break;
            case 7:
                character.setExperiencePoint(10001);
                character.setXpForNextLevel(8000);
                break;
            case 8:
                character.setExperiencePoint(18001);
                character.setXpForNextLevel(17000);
                break;
            case 9:
                character.setExperiencePoint(35001);
                character.setXpForNextLevel(35000);
                break;
            case 10:
                character.setExperiencePoint(70001);
                character.setXpForNextLevel(80000);
                break;
            case 11:
                character.setExperiencePoint(150001);
                character.setXpForNextLevel(50000);
                break;
            case 12:
                character.setExperiencePoint(200001);
                character.setXpForNextLevel(100000);
                break;

            default:
                character.setExperiencePoint(300001 + ((character.getLevel() - 13) * 80000));
                character.setXpForNextLevel(80000);
                break;
        }
    }

    @Override
    public void setPsySchool(Psy psy) {
        psy.setPsySchool(PsySchool.KYR);
    }

    @Override
    public void setBasePsyPoint(Psy psy) {
        psy.setBasePsyPoint(3);
    }

    @Override
    public void setUsageGrade(Psy psy) {
        psy.setUsageGrade(4);
    }

    @Override
    public void setPsyPointPerLevel(Psy psy) {
        psy.setPsyPointPerLevel(1);
    }

    @Override
    public void setMaxPsyPointPerLevel(Psy psy) {
        psy.setMaxPsyPointPerLevel(7);
    }

    @Override
    public void setXpPerPsyPoint(Psy psy) {
        psy.setXpPerPsyPoint(30);
    }

    @Override
    public int painResistancePontForXP() { return 40; }

    CombatPointModifiers combatPointModifiers = new CombatPointModifiers();

    @Override
    public int[] weaponTypeMidifiers(int combatModifier) {
        return combatPointModifiers.rangerModifier(combatModifier);
    }
}
