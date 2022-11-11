package exceptions;

/**
 * @author Sendoa and Haizea
 * Exception that is thrown when the Client cannot connect to the Server
 */
public class TimeOutException extends Exception {
    public TimeOutException() {
        super();
    }
    
    public TimeOutException(String msg) {
        super(msg);
    }
}
