package exceptions;

/**
 * @author Sendoa & Haizea
 * Exception that is thrown when the email format is not correct
 */
public class InvalidEmailValueException extends Exception {
    public InvalidEmailValueException() {
        super();
    }
    
    public InvalidEmailValueException(String msg) {
        super(msg);
    }
}
