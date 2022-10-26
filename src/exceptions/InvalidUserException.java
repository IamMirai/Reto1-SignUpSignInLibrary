package exceptions;

/**
 * @author Sendoa & Haizea
 * Exception that is thrown when the introduced User and/or Password in SignIn is/are not correct
 */
public class InvalidUserException extends Exception {
    public InvalidUserException() {
        super();
    }
    
    public InvalidUserException(String msg) {
        super(msg);
    }
}
