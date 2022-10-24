package datatransferobject;

/**
 *
 * @author Julen
 * Enum that sends and receives the type of response from the server and the client.
 */
public enum MessageEnum {
    RE_SIGNIN,
    RE_SIGNUP,
    AN_OK,
    AN_INVALIDUSER,
    AN_USEREXIST,
    AN_ERROR
}
