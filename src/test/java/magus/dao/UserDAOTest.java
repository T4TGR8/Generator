package magus.dao;

import magus.Encryption;
import magus.exceptions.InvalidAttributeException;
import magus.exceptions.NoCharactersException;
import magus.exceptions.UserAlredyExistException;
import magus.exceptions.WrongUserNameOrPasswordException;
import magus.model.*;
import magus.model.Character;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class UserDAOTest {
    UserDAO dao = new UserDAO();

    @Test(expected = UserAlredyExistException.class)
    public void testCreateUserTwiceWithException() throws UserAlredyExistException {
        dao.createUser(new User("TestUser2", "1234"));
    }

    @Test(expected = WrongUserNameOrPasswordException.class)
    public void testLoginNotExistingUser() throws WrongUserNameOrPasswordException {
        dao.loginUser("TestUser4", "1234##");
    }

    @Test
    public void testLoginUser() throws WrongUserNameOrPasswordException {
        dao.loginUser("TestUser3", "1234##");
    }

    @Test
    public void testReadUser() throws NoCharactersException {
        dao.readUser("Micsu", "123456##");
    }

    @Test(expected = NoCharactersException.class)
    public  void testReadUserWithoutCharacters() throws NoCharactersException{
        dao.readUser("TestUser2", "1234##");
    }

    @Test
    public void testUserOneToManyCharacters() throws UserAlredyExistException {

        User user = new User();
        user.setName("user");
        user.setPassword("jelszó");

        Character c1 = new Character();
        c1.setName("name1");

        Character c2 = new Character();
        c2.setName("name2");

        HashSet<Character> characters = new HashSet<>();
        characters.add(c1);
        characters.add(c2);

        user.setCharacters(characters);

        c1.setUser(user);
        c2.setUser(user);

        dao.createUser(user);
    }

    @Test
    public void testInsertUserWithFullCharacter() throws UserAlredyExistException, InvalidAttributeException {
        User user = new User();
        user.setName("Micsu");
        user.setPassword("123456");

        Character character = new Character();
        character.setName("Sede");
        character.setCaste(Caste.PALADIN);
        character.setRace(Race.ELF);
        character.setAge(120);
        character.setPersonality(Personality.ORDER);
        character.setReligion(Religion.NOIR);
        character.setSymbol(Symbol.SUNWELL);
        character.setBirthplace("Silvermoon");
        character.setSchool("Quel'Danas");
        character.setLevel(1);
        character.setExperiencePoint(0);
        character.setUser(user);
        user.addCharacter(character);

        Attributes atr = new Attributes(character);
        atr.setStrength(10);
        atr.setQuickness(10);
        atr.setDexterity(10);
        atr.setEndurance(10);
        atr.setEndurance(10);
        atr.setHealth(10);
        atr.setBeauty(10);
        atr.setIntelligence(10);
        atr.setWill(10);
        atr.setAstral(10);
        atr.setPerception(10);
        atr.setCharacter(character);
        character.setAttributes(atr);

        Skills skills = new Skills(character);
        skills.setBaseSkillPoints(100);
        skills.setSkillPointsPerLevel(5);
        skills.setSkillPoints(50);
        skills.setCharacter(character);
        character.setSkills(skills);

        Psy psy = new Psy(character);
        psy.setPsySchool(PsySchool.KYR);
        psy.setUsageLevel(3);
        psy.setUsageGrade(3);
        psy.setPsyPoints(5);
        psy.setAstralMagicShield(50);
        psy.setMentalMagicShield(50);
        psy.setCharacter(character);
        character.setPsy(psy);

        CombatStatistics stat = new CombatStatistics(character);
        stat.setInitiativePoints(10);
        stat.setAttackPoints(10);
        stat.setDefensePoints(10);
        stat.setAimingPoints(10);
        stat.setCombatModifierPerLevel(2);
        stat.setCharacter(character);
        character.setStatistics(stat);

        HealthAndPainRes hpRes = new HealthAndPainRes(character);
        hpRes.setBaseHealthPoints(500);
        hpRes.setMaxHealthPoints(500);
        hpRes.setBasePainResistancePoints(50);
        hpRes.setMaxPainResistancePoints(50);
        hpRes.setPainResistancePointsPerLevel(5);
        hpRes.setCharacter(character);
        character.setHealthAndPainRes(hpRes);

        dao.createUser(user);
    }

    @Test
    public void testSelectUser() throws NoCharactersException{

        User user = null;
        try {
            user = dao.readUser("user", "jelszó##");
        } catch (NoCharactersException e) {
            e.printStackTrace();
        }

        System.out.println(user.getName());
    }

}