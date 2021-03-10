package magus.dao;

import magus.model.User;
import org.junit.Test;

public class UserDAOTest {
    UserDAO dao = new UserDAO();

    @Test
    public void testCreateUser(){
        dao.createUser(new User("TestUser2", "1234"));
    }
}