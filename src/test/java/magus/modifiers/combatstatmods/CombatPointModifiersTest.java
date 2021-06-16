package magus.modifiers.combatstatmods;

import magus.exceptions.InvalidAttributeException;
import magus.generators.PaladinGen;
import magus.model.Caste;
import magus.model.Character;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombatPointModifiersTest {

    CombatPointModifiers cpm = new CombatPointModifiers();

    @Test // TestID: 6
    public void testAttackPointModifierFail(){
        int ap = cpm.AttackPointModifiers(12, 18, 15);

        Assert.assertNotEquals(16, ap);
    }

    @Test // TestID: 7
    public void testAttackPointModifier(){
        int ap = cpm.AttackPointModifiers(18, 12, 15);

        Assert.assertEquals(15, ap);
    }

    @Test // TestID: 8
    public void testAttackPointFromHM(){
        int[] mods = cpm.combatModifierSpender(9, Caste.PALADIN);

        Assert.assertEquals(4, mods[1]);
    }

    @Test // TestID: 9
    public void testBaseAttackPointAsPaladin() throws InvalidAttributeException {
        PaladinGen paladin = new PaladinGen(new Character());
        paladin.spendBasePoints();
        Character character = paladin.getCharacter();

        Assert.assertEquals(10, character.getStatistics().getBaseAttackPoints());
    }

    @Test // TestID: 10
    public void testAttackPointFromRandom() throws InvalidAttributeException {
        Character character = new Character();
        character.setCaste(Caste.PALADIN);
        PaladinGen paladin = new PaladinGen(character);
        paladin.spendBasePoints();

        int ap = character.getStatistics().getBaseAttackPoints();

        paladin.spendCharacterCreationPoints(paladin);

        int apRandomIncrease = character.getStatistics().getBaseAttackPoints() - ap;

        System.out.println(apRandomIncrease);
    }

    @Test // TestID: 11
    public void testFinalAttackPoint() throws InvalidAttributeException {

        Character paladin = new Character();
        paladin.setLevel(5);
        paladin.setCaste(Caste.PALADIN);

        PaladinGen gen = new PaladinGen(paladin);
        gen.spendBasePoints();
        gen.spendCharacterCreationPoints(gen);
        cpm.modifyCombatStats(paladin.getStatistics(), paladin.getAttributes());

        int[] mods = cpm.combatModifierSpender(paladin.getStatistics().getCombatModifierPerLevel(), paladin.getCaste());

        int finalAp = paladin.getStatistics().getAttackPoints() + mods[1] * paladin.getLevel();

        System.out.println( finalAp );
        Assert.assertEquals(paladin.getStatistics().getBaseAttackPoints() + 5 * mods[1]  ,finalAp);
    }



}