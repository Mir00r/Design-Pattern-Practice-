import java.io.Serializable;

/**
 * @author Mir00r on 08-Aug-19
 */
public class SerializedSingleton implements Serializable {

    /**
     * Sometimes in distributed systems, we need to implement Serializable interface in Singleton class.
     * <p>
     * So that we can store it’s state in file system and retrieve it at later point of time.
     * Here is a small singleton class that implements Serializable interface also.
     */

    /**
     * The problem with this serialized singleton class is that whenever we deserialize it, it will create a new instance of the class.
     */

    private static final long serialVersionUID = -1;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

}