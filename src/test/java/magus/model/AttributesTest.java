package magus.model;

import magus.exceptions.InvalidAttributeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttributesTest {

    @Test(expected = InvalidAttributeException.class) // TestID: 12
    public void testInvalidEndurance() throws InvalidAttributeException {
        Attributes atr = new Attributes();
        atr.setEndurance(99);
    }

    @Test // TestID: 13
    public void test() throws InvalidAttributeException {
        Attributes atr = new Attributes();
        atr.setEndurance(19);
    }
}