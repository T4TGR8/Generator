package magus.modifiers.combatstatmods;

public class MeleeModifierFactory implements IMeleeModifierFactory{

    @Override
    public int[] createMeleeModifier(int combatModifier) {
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
}
