package datatransferobject;

/**
 * @author haize
 * Interface of the model. It specifies the behavior of the model implementations.
 */
public interface Model {
    public User doSignIn(User user);
    public User doSignUp(User user); 
}
