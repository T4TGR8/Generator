package magus.exceptions;

public class WrongUserNameOrPasswordException extends Exception {
    public WrongUserNameOrPasswordException() {
    }

    public WrongUserNameOrPasswordException(String message) {
        super(message);
    }
}
