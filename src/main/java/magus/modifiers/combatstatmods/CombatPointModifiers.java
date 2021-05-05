package magus.modifiers.combatstatmods;

import magus.model.Attributes;
import magus.model.CombatStatistics;

public class CombatPointModifiers {

    public int AttackPointModifiers(int strength, int dexterity, int quickness){
        int modfromstr = strength - 10;
        if(modfromstr < 0) modfromstr = 0;
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if(modfromquick < 0) modfromquick = 0;
        return modfromstr + modfromdex + modfromquick;
    }

    public int InitiativePointModifiers(int dexterity, int quickness){
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if(modfromquick < 0) modfromquick = 0;
        return modfromdex + modfromquick;
    }

    public int DefendPointModifiers(int dexterity, int quickness){
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if(modfromquick < 0) modfromquick = 0;
        return modfromdex + modfromquick;
    }

    public int AimingPointModifiers(int dexterity){
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        return modfromdex;
    }

    public int DamageModifier(int strength){
        int modfromstr = strength - 16;
        if(modfromstr < 0) modfromstr = 0;
        return modfromstr;
    }

    public void modifyCombatStats(CombatStatistics stat, Attributes atr){

        System.out.println("Bent");
        int str = atr.getStrength();
        int dex = atr.getDexterity();
        int quick = atr.getQuickness();

        stat.setBaseAttackPoints(stat.getBaseAttackPoints() + AttackPointModifiers(str, dex, quick));
        stat.setBaseInitiativePoints(stat.getBaseInitiativePoints() + InitiativePointModifiers(dex, quick));
        stat.setBaseDefensePoints(stat.getBaseDefensePoints() + DefendPointModifiers(dex, quick));
        stat.setBaseAimingPoints(stat.getBaseAimingPoints() + AimingPointModifiers(dex));

    }
}
