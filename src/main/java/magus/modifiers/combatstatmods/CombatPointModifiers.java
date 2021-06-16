package magus.modifiers.combatstatmods;

import magus.generators.CharacterGen;
import magus.model.Attributes;
import magus.model.Caste;
import magus.model.CombatStatistics;

import java.util.Random;

public class CombatPointModifiers {

    public int AttackPointModifiers(int strength, int dexterity, int quickness) {
        int modfromstr = strength - 10;
        if (modfromstr < 0) modfromstr = 0;
        int modfromdex = dexterity - 10;
        if (modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if (modfromquick < 0) modfromquick = 0;
        return modfromstr + modfromdex + modfromquick;
    }

    public int InitiativePointModifiers(int dexterity, int quickness) {
        int modfromdex = dexterity - 10;
        if (modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if (modfromquick < 0) modfromquick = 0;
        return modfromdex + modfromquick;
    }

    public int DefendPointModifiers(int dexterity, int quickness) {
        int modfromdex = dexterity - 10;
        if (modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if (modfromquick < 0) modfromquick = 0;
        return modfromdex + modfromquick;
    }

    public int AimingPointModifiers(int dexterity) {
        int modfromdex = dexterity - 10;
        if (modfromdex < 0) modfromdex = 0;
        return modfromdex;
    }

    public int DamageModifier(int strength) {
        int modfromstr = strength - 16;
        if (modfromstr < 0) modfromstr = 0;
        return modfromstr;
    }

    public void modifyCombatStats(CombatStatistics stat, Attributes atr) {

        int str = atr.getStrength();
        int dex = atr.getDexterity();
        int quick = atr.getQuickness();

        stat.setAttackPoints(stat.getBaseAttackPoints() + AttackPointModifiers(str, dex, quick));
        stat.setInitiativePoints(stat.getBaseInitiativePoints() + InitiativePointModifiers(dex, quick));
        stat.setDefensePoints(stat.getBaseDefensePoints() + DefendPointModifiers(dex, quick));
        stat.setAimingPoints(stat.getBaseAimingPoints() + AimingPointModifiers(dex));
    }

    public int[] combatModifierSpender(int combatModifier, CharacterGen characterGen) {
        return characterGen.weaponTypeMidifiers(combatModifier);
    }

    public int[] meleeModifiers(int combatModifier) {
        MeleeModifierFactory meleeModifierFactory = new MeleeModifierFactory();
        return meleeModifierFactory.createMeleeModifier(combatModifier);
    }

    public int[] rangerModifier(int combatModifier) {
        RangedModifierFactory rangedModifierFactory = new RangedModifierFactory();
        return rangedModifierFactory.createRangedModifier(combatModifier);
    }
}
