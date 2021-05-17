package magus.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReligionTest {

    @Test // TestID: 14
    public void testOrwellaString(){
        Religion orwella = Religion.ORWELLA;

        Assert.assertEquals("Orwella", orwella.getReligionString());
    }

}