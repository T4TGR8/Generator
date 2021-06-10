package magus.generators;

import magus.model.Caste;
import magus.model.Character;

public interface CharacterGenFactory {
    CharacterGen createCharacter(Character character);
}
