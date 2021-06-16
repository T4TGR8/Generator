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

        switch (combatModifier) {

            case 3:
                return new int[]{1, 1, 1, 0};
            case 4:
                return new int[]{1, 2, 1, 0};
            case 5:
                return new int[]{1, 2, 2, 0};
            case 6:
                return new int[]{1, 3, 2, 0};
            case 7:
                return new int[]{1, 3, 3, 0};
            case 8:
                return new int[]{2, 3, 3, 0};
            case 9:
                return new int[]{2, 4, 3, 0};
            case 10:
                return new int[]{2, 4, 4, 0};
            case 11:
                return new int[]{2, 5, 4, 0};
            case 12:
                return new int[]{2, 5, 5, 0};
            case 13:
                return new int[]{2, 6, 5, 0};
            case 14:
                return new int[]{2, 6, 6, 0};
            case 15:
                return new int[]{3, 6, 6, 0};
            case 16:
                return new int[]{3, 7, 6, 0};
            case 17:
                return new int[]{3, 7, 7, 0};
            case 18:
                return new int[]{3, 8, 7, 0};
            case 19:
                return new int[]{3, 8, 8, 0};
            case 20:
                return new int[]{4, 8, 8, 0};

            default:
                return new int[]{0, 0, 0, 0};
        }


    }

    public int[] rangerModifier(int combatModifier) {
        switch (combatModifier) {

            case 3:
                return new int[]{1, 1, 1, 0};
            case 4:
                return new int[]{1, 1, 1, 1};
            case 5:
                return new int[]{1, 1, 1, 2};
            case 6:
                return new int[]{1, 2, 1, 2};
            case 7:
                return new int[]{1, 2, 2, 2};
            case 8:
                return new int[]{1, 2, 2, 3};
            case 9:
                return new int[]{2, 2, 2, 3};
            case 10:
                return new int[]{2, 2, 2, 4};
            case 11:
                return new int[]{2, 2, 2, 5};
            case 12:
                return new int[]{2, 3, 2, 5};
            case 13:
                return new int[]{2, 3, 3, 5};
            case 14:
                return new int[]{3, 3, 3, 5};
            case 15:
                return new int[]{3, 3, 3, 6};
            case 16:
                return new int[]{3, 4, 3, 6};
            case 17:
                return new int[]{3, 4, 4, 6};
            case 18:
                return new int[]{4, 4, 4, 6};
            case 19:
                return new int[]{4, 4, 4, 7};
            case 20:
                return new int[]{4, 4, 4, 8};

            default:
                return new int[]{0, 0, 0, 0};
        }

    }
}
