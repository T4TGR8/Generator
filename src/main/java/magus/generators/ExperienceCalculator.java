package magus.generators;

import magus.model.Character;

public class ExperienceCalculator {

    private Character character;

    public ExperienceCalculator(Character character) {
        this.character = character;
    }


    public void calculateXP(CharacterGen characterGen) {
        int level = character.getLevel();
        characterGen.calculateXP(level);
    }
}
