package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.model.*;
import magus.modifiers.combatstatmods.CombatPointModifiers;

public class PriestGen extends CharacterGenerator implements CharacterGen {

    Attributes atr = character.getAttributes();
    CombatStatistics stat = character.getStatistics();
    HealthAndPainRes HPAndPain = character.getHealthAndPainRes();
    Skills skills = character.getSkills();

    public PriestGen(Character character) {
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
                character.setXpForNextLevel(161);
                break;
            case 2:
                character.setExperiencePoint(161);
                character.setXpForNextLevel(170);
                break;
            case 3:
                character.setExperiencePoint(331);
                character.setXpForNextLevel(330);
                break;
            case 4:
                character.setExperiencePoint(661);
                character.setXpForNextLevel(640);
                break;
            case 5:
                character.setExperiencePoint(1301);
                character.setXpForNextLevel(1300);
                break;
            case 6:
                character.setExperiencePoint(2601);
                character.setXpForNextLevel(2400);
                break;
            case 7:
                character.setExperiencePoint(5001);
                character.setXpForNextLevel(4000);
                break;
            case 8:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(14000);
                break;
            case 9:
                character.setExperiencePoint(23001);
                character.setXpForNextLevel(27000);
                break;
            case 10:
                character.setExperiencePoint(50001);
                character.setXpForNextLevel(40000);
                break;
            case 11:
                character.setExperiencePoint(90001);
                character.setXpForNextLevel(40000);
                break;
            case 12:
                character.setExperiencePoint(130001);
                character.setXpForNextLevel(35000);
                break;

            default:
                character.setExperiencePoint(165001 + ((character.getLevel() - 13) * 50000));
                character.setXpForNextLevel(50000);
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
    public int painResistancePontForXP() { return 20; }

    CombatPointModifiers combatPointModifiers = new CombatPointModifiers();

    @Override
    public int[] weaponTypeMidifiers(int combatModifier) {
        return combatPointModifiers.rangerModifier(combatModifier);
    }
}
