package magus.generators;

import magus.model.Character;

public interface CharacterGenFactory {
    CharacterGen createCharacter(Character character);
}
