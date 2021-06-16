package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Caste;
import magus.model.Character;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PsyRelatedFunctionsTest {



    @Test  // TestID: 15
    public void testBasePsyPont() throws InvalidAttributeException {
        Character character = new Character();
        character.setCaste(Caste.WIZARD);
        character.getAttributes().setIntelligence(15);

        PsyRelatedFunctions prf = new PsyRelatedFunctions(character);

        //prf.modifyPsy();

        Assert.assertEquals(8, character.getPsy().getBasePsyPoint());
    }

}