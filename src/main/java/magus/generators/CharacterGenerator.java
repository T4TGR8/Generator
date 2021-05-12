package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;
import magus.modifiers.attribmods.SummarizedAttributeModifiers;
import magus.modifiers.combatstatmods.CombatPointModifiers;
import magus.modifiers.healthstatmods.HpAndRpModifiers;

public abstract class CharacterGenerator {

    private CharacterPointSpenders cps;
    private SummarizedAttributeModifiers sam;
    private CombatPointModifiers cpm;
    private HpAndRpModifiers hpm;
    private PsyRelatedFunctions prf;

    Character character;

    public void spendCharacterCreationPoints() {
        try {

            spendBasePoints();
            cps.spendCharacterSpecPoints(Kap());
            sam.modifyAttribute(character.getAttributes(), character.getRace(), character.getAge());
            cpm.modifyCombatStats(character.getStatistics(), character.getAttributes());
            hpm.modifyHealthAndPain(character.getHealthAndPainRes(), character.getAttributes(), character.getLevel());
            prf.modifyPsy();

        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
    }

    public Character getCharacter() {
        return character;
    }

    public abstract void spendBasePoints() throws InvalidAttributeException;

    public CharacterGenerator(Character character) {
        this.character = character;
        cps = new CharacterPointSpenders(character);
        sam = new SummarizedAttributeModifiers();
        cpm = new CombatPointModifiers();
        hpm = new HpAndRpModifiers();
        prf = new PsyRelatedFunctions(character);
    }

    public abstract int Kap();

}
