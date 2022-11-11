package exceptions;

/**
 * @author Sendoa and Haizea
 * Exception that is thrown when the password format is not correct
 */
public class InvalidPasswordValueException extends Exception {
    public InvalidPasswordValueException() {
        super();
    }
    
    public InvalidPasswordValueException(String msg) {
        super(msg);
    }
}
