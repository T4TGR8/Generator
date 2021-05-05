package magus.modifiers.healthstatmods;

import magus.model.Attributes;
import magus.model.Caste;
import magus.model.HealthAndPainRes;

public class HpAndRpModifiers {

    //region These functions are adding the life and pain resistance point modifiers which is coming from attributes

    public int HealthPointModifier(int health) {
        int modifier = health - 10;
        if (0 < modifier) return modifier;
        else return 0;
    }

    public int ResistancePointModifier(int endurance, int will) {
        int modfromend = endurance - 10;
        if (modfromend < 0) modfromend = 0;
        int modfromwill = will - 10;
        if (modfromwill < 0) modfromwill = 0;
        return modfromend + modfromwill;
    }

    //endregion

    public void modifyHealthAndPain(HealthAndPainRes hpr, Attributes atr, int level) {
        int health = atr.getHealth();
        int end = atr.getEndurance();
        int will = atr.getWill();

        hpr.setMaxHealthPoints(hpr.getBaseHealthPoints() + HealthPointModifier(health));
        hpr.setMaxPainResistancePoints(hpr.getBasePainResistancePoints() +
                ResistancePointModifier(end, will) + (level * hpr.getPainResistancePointsPerLevel()));
    }


    // data required values are not accurate
    public int painResistancePontForXP(Caste caste) {

        switch (caste) {
            case WARRIOR:
            case MARTIAL_ARTIST:
            case SWORD_ARTIST:
                return 10;

            case GLADIATOR:
            case BARBARIAN:
            case PSY_MASTER:
            case PALADIN:
                return 12;

            case HEADHUNTER:
            case AMAZON:
            case WITCH_MASTER:
                return 13;

            case KNIGHT:
                return 15;

            case DUELER:
                return 14;

            case THIEF:
            case WITCH:
                return 25;

            case BARD:
            case FIRE_MAGE:
                return 30;

            case ILLUSIONIST:
                return 27;

            case PRIEST:
                return 20;

            case WIZARD:
                return 40;

            default:
                return 0;
        }
    }
}
