package exceptions;

/**
 * @author Sendoa & Haizea
 * Exception that is thrown when the username format is not correct
 */
public class InvalidUserValueException extends Exception {
    public InvalidUserValueException() {
        super();
    }
    
    public InvalidUserValueException(String msg) {
        super(msg);
    }
}
