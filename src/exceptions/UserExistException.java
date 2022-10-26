package exceptions;

/**
 * @author Haizea & Sendoa
 * Exception that is thrown when the User introduced in SignUp alredy exist
 */
public class UserExistException extends Exception {
    public UserExistException() {
        super();
    }
    
    public UserExistException(String msg) {
        super(msg);
    }
}
