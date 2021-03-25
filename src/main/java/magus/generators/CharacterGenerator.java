package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Character;

public abstract class CharacterGenerator {

    private CharacterPointSpenders cps;

    Character character;

    public void spendCharacterCreationPoints() {
        try {

            spendBasePoints();
            cps.spendCharacterSpecPoints(Kap());

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
    }

    public abstract int Kap();
}
