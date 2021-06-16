package magus.modifiers.combatstatmods;

public class RangedModifierFactory implements IRangedModifierFactory{
    @Override
    public int[] createRangedModifier(int combatModifier) {
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
