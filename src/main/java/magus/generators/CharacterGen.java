package magus.generators;

import magus.exceptions.InvalidAttributeException;

public interface CharacterGen {
    int Kap();

    void spendBasePoints() throws InvalidAttributeException;

    void calculateXP(int level);
}
