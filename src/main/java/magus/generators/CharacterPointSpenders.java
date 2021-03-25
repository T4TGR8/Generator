package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Attributes;
import magus.model.Character;
import magus.model.CombatStatistics;
import magus.model.HealthAndPainRes;
import magus.model.Skills;

import java.util.Random;

public class CharacterPointSpenders {

    Character character;
    Attributes atr;
    CombatStatistics stat;
    HealthAndPainRes HPAndPain;
    Skills skills;
    Random rnd = new Random();

    public CharacterPointSpenders(Character character) {
        this.character = character;

        atr = character.getAttributes();
        stat = character.getStatistics();
        HPAndPain = character.getHealthAndPainRes();
        skills = character.getSkills();
    }

    public void spendCharacterSpecPoints(int kap) throws InvalidAttributeException {
        while (kap >= 0){
            if(kap >= 4){
                int roll = (1 + rnd.nextInt(20));
                switch (roll){
                    case 1:
                        atr.setStrength(atr.getStrength() + 1);
                        if(atr.getStrength() < 16) kap--;
                        else if(atr.getStrength() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 2:
                        atr.setDexterity(atr.getDexterity() + 1);
                        if(atr.getDexterity() < 16) kap--;
                        else if(atr.getDexterity() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 3:
                        atr.setQuickness(atr.getQuickness() + 1);
                        if(atr.getQuickness() < 16) kap--;
                        else if(atr.getQuickness() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 4:
                        atr.setEndurance(atr.getEndurance() + 1);
                        if(atr.getEndurance() < 16) kap--;
                        else if(atr.getEndurance() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 5:
                        atr.setHealth(atr.getHealth() + 1);
                        if(atr.getHealth() < 16) kap--;
                        else if(atr.getHealth() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 6:
                        atr.setBeauty(atr.getBeauty() + 1);
                        if(atr.getBeauty() < 16) kap--;
                        else if(atr.getBeauty() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 7:
                        atr.setWill(atr.getWill() + 1);
                        if(atr.getWill() < 16) kap--;
                        else if(atr.getWill() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 8:
                        atr.setIntelligence(atr.getIntelligence() + 1);
                        if(atr.getIntelligence() < 16) kap--;
                        else if(atr.getIntelligence() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 9:
                        atr.setAstral(atr.getAstral() + 1);
                        if(atr.getAstral() < 16) kap--;
                        else if(atr.getAstral() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 10:
                        atr.setPerception(atr.getPerception() + 1);
                        if(atr.getPerception() < 16) kap--;
                        else if(atr.getPerception() < 19) kap -= 2;
                        else kap -= 4;
                        break;
                    case 11:
                        stat.setBaseInitiativePoints(stat.getBaseInitiativePoints() + 1);
                        kap--;
                        break;
                    case 12:
                        stat.setBaseAttackPoints(stat.getBaseAttackPoints() + 1);
                        kap--;
                        break;
                    case 13:
                        stat.setBaseDefensePoints(stat.getBaseDefensePoints() + 1);
                        kap--;
                        break;
                    case 14:
                        stat.setBaseAimingPoints(stat.getBaseAimingPoints() + 1);
                        kap--;
                        break;
                    case 15:
                        stat.setCombatModifierPerLevel(stat.getCombatModifierPerLevel() + 1);
                        kap -= 3;
                        break;
                    case 16:
                        HPAndPain.setBaseHealthPoints(HPAndPain.getBaseHealthPoints() + 1);
                        kap -= 2;
                        break;
                    case 17:
                        HPAndPain.setBasePainResistancePoints(HPAndPain.getBasePainResistancePoints() + 1);
                        kap--;
                        break;
                    case 18:
                        HPAndPain.setPainResistancePointsPerLevel(HPAndPain.getPainResistancePointsPerLevel() + 1);
                        kap -= 3;
                        break;
                    case 19:
                        skills.setBaseSkillPoints(skills.getBaseSkillPoints() + 1);
                        kap--;
                        break;
                    case 20:
                        skills.setSkillPointsPerLevel(skills.getSkillPointsPerLevel() + 1);
                        kap -= 2;
                        break;
                }
            }
            else if(kap == 3){
                int roll = (1 + rnd.nextInt(10));
                switch (roll){
                    case 1:
                        stat.setBaseInitiativePoints(stat.getBaseInitiativePoints() + 1);
                        kap--;
                    case 2:
                        stat.setBaseAttackPoints(stat.getBaseAttackPoints() + 1);
                        kap--;
                    case 3:
                        stat.setBaseDefensePoints(stat.getBaseDefensePoints() + 1);
                        kap--;
                    case 4:
                        stat.setBaseAimingPoints(stat.getBaseAimingPoints() + 1);
                        kap--;
                    case 5:
                        stat.setCombatModifierPerLevel(stat.getCombatModifierPerLevel() + 1);
                        kap -= 3;
                    case 6:
                        HPAndPain.setBaseHealthPoints(HPAndPain.getBaseHealthPoints() + 1);
                        kap -= 2;
                    case 7:
                        HPAndPain.setBasePainResistancePoints(HPAndPain.getBasePainResistancePoints() + 1);
                        kap--;
                    case 8:
                        HPAndPain.setPainResistancePointsPerLevel(HPAndPain.getPainResistancePointsPerLevel() + 1);
                        kap -= 3;
                    case 9:
                        skills.setBaseSkillPoints(skills.getBaseSkillPoints() + 1);
                        kap--;
                    case 10:
                        skills.setSkillPointsPerLevel(skills.getSkillPointsPerLevel() + 1);
                        kap -= 2;

                }
            }
            else if(kap == 2){
                int roll = (1 + rnd.nextInt(8));
                switch (roll){
                    case 1:
                        stat.setBaseInitiativePoints(stat.getBaseInitiativePoints() + 1);
                        kap--;
                    case 2:
                        stat.setBaseAttackPoints(stat.getBaseAttackPoints() + 1);
                        kap--;
                    case 3:
                        stat.setBaseDefensePoints(stat.getBaseDefensePoints() + 1);
                        kap--;
                    case 4:
                        stat.setBaseAimingPoints(stat.getBaseAimingPoints() + 1);
                        kap--;
                    case 5:
                        HPAndPain.setBaseHealthPoints(HPAndPain.getBaseHealthPoints() + 1);
                        kap -= 2;
                    case 6:
                        HPAndPain.setBasePainResistancePoints(HPAndPain.getBasePainResistancePoints() + 1);
                        kap--;
                    case 7:
                        skills.setBaseSkillPoints(skills.getBaseSkillPoints() + 1);
                        kap--;
                    case 8:
                        skills.setSkillPointsPerLevel(skills.getSkillPointsPerLevel() + 1);
                        kap -= 2;
                }
            }
            else {
                int roll = (1 + rnd.nextInt(6));
                switch (roll){
                    case 1:
                        stat.setBaseInitiativePoints(stat.getBaseInitiativePoints() + 1);
                        kap--;
                    case 2:
                        stat.setBaseAttackPoints(stat.getBaseAttackPoints() + 1);
                        kap--;
                    case 3:
                        stat.setBaseDefensePoints(stat.getBaseDefensePoints() + 1);
                        kap--;
                    case 4:
                        stat.setBaseAimingPoints(stat.getBaseAimingPoints() + 1);
                        kap--;
                    case 5:
                        HPAndPain.setBasePainResistancePoints(HPAndPain.getBasePainResistancePoints() + 1);
                        kap--;
                    case 6:
                        skills.setBaseSkillPoints(skills.getBaseSkillPoints() + 1);
                        kap--;
                }
            }
        }
    }
}
