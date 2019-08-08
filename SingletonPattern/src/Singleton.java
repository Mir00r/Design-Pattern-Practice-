/**
 * @author Mir00r on 08-Aug-19
 */
public class Singleton {

    /**
     * There are multiple ways to write thread-safe singleton in Java
     *
     * By writing singleton using double checked locking.
     * By using static Singleton instance initialized during class loading.
     * By the way using Java enum to create thread-safe singleton this is most simple way.
     */

    /**
     * Singleton objects can be created in two ways.
     * <p>
     * Lazy loading
     * Eager loading
     */

    //create an object of Singleton
    private static Singleton singletonInstance = new Singleton();

    //make the constructor private so that this class cannot be instantiated
    private Singleton() {
    }

    //Get the only object available
    public static Singleton getInstance() {
        return singletonInstance;
    }

    // --------------- Eager initialization in singleton --------------------

    /**
     * In eager initialization, the instance of Singleton Class is created at the time of class loading.
     * <p>
     * This is the easiest method but it has a drawback that instance is created even though it might not be using it by any client.
     * <p>
     * Here is the implementation in Java
     */

    // ------------- Problem of Eager initialization in singleton -----------------
    /**
     * But in most of the scenarios, Singleton classes are created for resources such as
     * Database connections etc and we should avoid the instantiation until client calls the getInstance method.
     */

    private static final Singleton eagerInstance = new Singleton();

    public static Singleton getEagerInstance() {
        return eagerInstance;
    }

    // --------------- Static block initialization in singleton --------------------

    /**
     * Static block initialization implementation is similar to eager initialization,
     * except that instance of class is created in the static block that provides option for exception handling.
     */
    private static Singleton staticBlockInstance;

    /**
     * Both eager initialization and static block initialization creates the instance
     * even before it’s being used and that is not the best practice to use.
     */
    //static block initialization for exception handling
    static {
        try {
            staticBlockInstance = new Singleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }


    // --------------- Lazy initialization in singleton --------------------

    /**
     * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
     * Here is the sample code for creating Singleton class with this approach.
     */

    private static Singleton lazyInstance;

    /**
     * The below implementation works fine in case of single threaded environment but when it comes to multithreaded systems.
     * It can cause issues if multiple threads are inside the if loop at the same time.
     * It will destroy the singleton pattern and both threads will get the different instances of singleton class.
     *
     * @return
     */
    public static Singleton getLazyInstance() {
        if (lazyInstance == null) {
            lazyInstance = new Singleton();
        }
        return lazyInstance;
    }

    // --------------- Thread safe singleton --------------------

    /**
     * The easier way to create a thread-safe singleton class is to make the global access method synchronized.
     * <p>
     * So that only one thread can execute this method at a time. General implementation of this approach is like the below class.
     */

    private static Singleton threadSafeInstance;

    /**
     * Above implementation works fine and provides thread-safety but it reduces the performance because of cost associated with the synchronized method.
     * <p>
     * Although we need it only for the first few threads who might create the separate instances (Read: Java Synchronization).
     *
     * @return
     */
    public static synchronized Singleton getThreadSafeInstance() {
        if (threadSafeInstance == null) {
            threadSafeInstance = new Singleton();
        }
        return threadSafeInstance;
    }

    /**
     * To avoid this extra overhead every time, double checked locking principle is used. In this approach.
     * <p>
     * The synchronized block is used inside the if condition with an additional check to ensure that only one instance of singleton class is created.
     * <p>
     * Code below provides the double checked locking implementation.
     *
     * @return
     */
    public static Singleton getInstanceUsingDoubleLocking() {
        if (threadSafeInstance == null) {
            synchronized (Singleton.class) {
                if (threadSafeInstance == null) {
                    threadSafeInstance = new Singleton();
                }
            }
        }
        return threadSafeInstance;
    }

    public void showMessage() {
        System.out.println("Hello Singleton Pattern");
    }
}
