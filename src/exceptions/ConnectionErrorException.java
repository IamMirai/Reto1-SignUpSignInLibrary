package exceptions;

/**
 * @author Sendoa and Haizea
 * Exception that is thrown when the server side cannot connect to the database
 */
public class ConnectionErrorException extends Exception {
    public ConnectionErrorException() {
        super();
    }
    
    public ConnectionErrorException(String msg) {
        super(msg);
    }
}
