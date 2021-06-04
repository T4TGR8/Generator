package magus.generators;

import magus.exceptions.InvalidAttributeException;

public interface CharacterGen {
    public int Kap();

    public void spendBasePoints() throws InvalidAttributeException;
}
