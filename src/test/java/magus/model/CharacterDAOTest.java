package magus.model;

import magus.dao.CharacterDAO;
import org.junit.Test;

public class CharacterDAOTest {

    CharacterDAO dao = new CharacterDAO();

    @Test
    public void testCharacterOneToOne(){
        Attributes a = new Attributes();
        a.setStrength(9000);

        Skills s = new Skills();
        s.setBaseSkillPoints(100);

        Psy p = new Psy();
        p.setPsyPoints(42);

        HealthAndPainRes hp = new HealthAndPainRes();
        hp.setBaseHealthPoints(10);
        hp.setBasePainResistancePoints(10);

        CombatStatistics st = new CombatStatistics();
        st.setAttackPoints(9000);

        Character c = new Character();
        c.setName("Micsu");

        c.setAttributes(a);
        c.setHealthAndPainRes(hp);
        c.setSkills(s);
        c.setStatistics(st);
        c.setPsy(p);

        a.setCharacter(c);
        hp.setCharacter(c);
        s.setCharacter(c);
        p.setCharacter(c);
        st.setCharacter(c);

        dao.createCharacter(c);
    }

}