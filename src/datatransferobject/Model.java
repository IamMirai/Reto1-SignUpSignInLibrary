package datatransferobject;

/**
 * @author haize
 * Interface of the model. It specifies the behavior of the model implementations.
 */
public interface Model {
    public Package doSignIn(User user);
    public Package doSignUp(User user); 
}
