package magus.exceptions;

public class UserAlredyExistException extends Exception {
    public UserAlredyExistException() {
    }

    public UserAlredyExistException(String message) {
        super(message);
    }
}
