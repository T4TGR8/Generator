package magus.dao;

import magus.model.Character;
import magus.model.User;
import org.junit.Test;

import java.util.HashSet;

public class UserDAOTest {
    UserDAO dao = new UserDAO();

    @Test
    public void testCreateUser(){
        dao.createUser(new User("TestUser2", "1234"));
    }

    @Test
    public void testUserOneToManyCharacters(){

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
}