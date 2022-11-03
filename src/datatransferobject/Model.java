package datatransferobject;

import exceptions.ConnectionErrorException;
import exceptions.InvalidUserException;
import exceptions.MaxConnectionExceededException;
import exceptions.TimeOutException;
import exceptions.UserExistException;

/**
 * @author haize
 * Interface of the model. It specifies the behavior of the model implementations.
 */
public interface Model {
    public User doSignIn(User user) throws InvalidUserException, ConnectionErrorException, TimeOutException, MaxConnectionExceededException;
    public User doSignUp(User user) throws UserExistException, ConnectionErrorException, TimeOutException, MaxConnectionExceededException; 
}
