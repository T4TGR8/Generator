package magus.modifiers.attribmods;

import magus.model.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttributeTests {

    AgeCategoryDefiner acd = new AgeCategoryDefiner();
    RacialAttributeModifiers ram = new RacialAttributeModifiers();
    AgeAttributeModifiers aam = new AgeAttributeModifiers();
    SummarizedAttributeModifiers sam = new SummarizedAttributeModifiers();

    @Test // TestID: 2
    public void testDwarfAgeCategory1() {
        int categorymin = acd.DwarfAgeCategories(25);
        int categorymax = acd.DwarfAgeCategories(40);

        Assert.assertEquals(1, categorymin);
        Assert.assertEquals(1, categorymax);
    }

    @Test // TestID: 3
    public void testDwarfStrengthModifierFromAgeCategory1() {
        int strMod = aam.StrengthAgeModifier(Race.DWARF, 25);

        Assert.assertEquals(-2, strMod);
    }

    @Test // TestID: 4
    public void testDwarfStrengthModifierFromRacialModifier() {
        int strMod = ram.StrengthRacialModifier(Race.DWARF);

        Assert.assertEquals(1, strMod);
    }

    @Test // TestID: 5
    public void testDwarfSummarizedStrengthModifier() {
        int strMod = sam.StrengthModifier(Race.DWARF, 25);

        Assert.assertEquals(-1, strMod);
    }

}