package exceptions;

/**
 * @author Sendoa & Haizea
 * Exception that is thrown when the connections with the server side are exceeded
 */
public class MaxConnectionExceededException extends Exception {
    public MaxConnectionExceededException() {
        super();
    }
    
    public MaxConnectionExceededException(String msg) {
        super(msg);
    }
}
