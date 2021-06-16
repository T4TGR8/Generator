package magus.modifiers.healthstatmods;

import magus.generators.CharacterGen;
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
    public int painResistancePontForXP(CharacterGen characterGen) {
        return characterGen.painResistancePontForXP();
    }
}
