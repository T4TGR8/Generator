package magus.generators;

import magus.model.*;
import magus.model.Character;

public class PsyRelatedFunctions {

    private Character character;

    private Psy psy;
    private Attributes atr;


    public PsyRelatedFunctions(Character character) {
        this.character = character;
        this.psy = character.getPsy();
        this.atr = character.getAttributes();
    }

    private void setPsy(CharacterGen characterGen) {
        characterGen.setPsySchool(psy);
        characterGen.setBasePsyPoint(psy);
        characterGen.setUsageGrade(psy);
        characterGen.setPsyPointPerLevel(psy);
        characterGen.setMaxPsyPointPerLevel(psy);
        characterGen.setXpPerPsyPoint(psy);
    }

    private void setBasePsyPoint(int intelligence) {
        if (psy.getPsySchool() != PsySchool.NINCS) {
            int modint = intelligence - 10;
            if (modint < 0) modint = 0;
            psy.setBasePsyPoint(psy.getBasePsyPoint() + modint);
        }
    }

    private void setMiscShields(int astral, int will) {
        if (psy.getPsySchool() != PsySchool.NINCS) {
            int modast = astral - 10;
            if (modast < 0) modast = 0;
            psy.setMiscAstralMagicShield(modast);

            int modwill = will - 10;
            if (modwill < 0) modwill = 0;
            psy.setMiscMentalMagicShield(modwill);
        }
    }


    private void setPsyShields(){
        psy.setStaticAstralMagicShield(psy.getPsyPoints());
        psy.setStaticMentalMagicShield(psy.getPsyPoints());
        psy.setDynamicAstralMagicShield(0);
        psy.setDynamicMentalMagicShield(0);

        setMiscShields(atr.getAstral(), atr.getWill());

        psy.setAstralMagicShield(psy.getDynamicAstralMagicShield() +
                psy.getMiscAstralMagicShield() + psy.getStaticAstralMagicShield());

        psy.setMentalMagicShield(psy.getDynamicMentalMagicShield() +
                psy.getMiscMentalMagicShield() + psy.getStaticMentalMagicShield());
    }

    public void modifyPsy(CharacterGen characterGen) {
        setPsy(characterGen);

        psy.setUsageLevel(psy.getPsySchool() != PsySchool.NINCS
                ? character.getLevel()
                : 0);

        setBasePsyPoint(character.getAttributes().getIntelligence());
        psy.setPsyPoints(psy.getBasePsyPoint() + psy.getPsyPointPerLevel() * character.getLevel());

        setPsyShields();
    }
}
