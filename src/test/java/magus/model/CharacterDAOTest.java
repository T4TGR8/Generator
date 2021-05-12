package magus.model;

import magus.dao.CharacterDAO;
import magus.dao.UserDAO;
import magus.exceptions.InvalidAttributeException;
import magus.exceptions.WrongUserNameOrPasswordException;
import org.junit.Test;

public class CharacterDAOTest {

    CharacterDAO dao = new CharacterDAO();
    UserDAO userDAO = new UserDAO();

    @Test
    public void testCharacterOneToOne() throws InvalidAttributeException, WrongUserNameOrPasswordException {
        User user = userDAO.loginUser("newUser", "111##");
        Character c = new Character();
        c.setName("Micsu");

        Attributes a = new Attributes(c);
        a.setStrength(9);

        Skills s = new Skills(c);
        s.setBaseSkillPoints(100);

        Psy p = new Psy(c);
        p.setPsyPoints(42);

        HealthAndPainRes hp = new HealthAndPainRes(c);
        hp.setBaseHealthPoints(10);
        hp.setBasePainResistancePoints(10);

        CombatStatistics st = new CombatStatistics(c);
        st.setAttackPoints(9000);

        c.setAttributes(a);
        c.setHealthAndPainRes(hp);
        c.setSkills(s);
        c.setStatistics(st);
        c.setPsy(p);
        c.setUser(user);

        a.setCharacter(c);
        hp.setCharacter(c);
        s.setCharacter(c);
        p.setCharacter(c);
        st.setCharacter(c);

        dao.createCharacter(c);
    }



}