package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Psy;

public interface CharacterGen {
    int Kap();

    void spendBasePoints() throws InvalidAttributeException;

    void calculateXP(int level);

    void setPsySchool(Psy psy);
    void setBasePsyPoint(Psy psy);
    void setUsageGrade(Psy psy);
    void setPsyPointPerLevel(Psy psy);
    void setMaxPsyPointPerLevel(Psy psy);
    void setXpPerPsyPoint(Psy psy);
}
