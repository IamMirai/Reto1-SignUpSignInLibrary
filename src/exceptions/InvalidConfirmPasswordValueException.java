package exceptions;

/**
 *
 * @author Haizea
 * Exception that is thrown when the config password doesn´t match with the password
 */
public class InvalidConfirmPasswordValueException extends Exception {
    public InvalidConfirmPasswordValueException() {
        super();
    }
    
    public InvalidConfirmPasswordValueException(String msg) {
        super(msg);
    }
}
