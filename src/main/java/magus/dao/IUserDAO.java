package magus.dao;

import magus.exceptions.NoCharactersException;
import magus.exceptions.UserAlredyExistException;
import magus.exceptions.WrongUserNameOrPasswordException;
import magus.model.User;

public interface IUserDAO {
    void createUser(User user) throws UserAlredyExistException;
    User loginUser(String name, String password) throws WrongUserNameOrPasswordException;
    User readUser(String name, String password) throws NoCharactersException;
}
