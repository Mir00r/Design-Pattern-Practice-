import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //illegal construct
        //Compile Time Error: The constructor Singleton() is not visible
        //Singleton object = new Singleton();

        //Get the only object available
        //Singleton object = Singleton.getInstance();

        //show the message
        //object.showMessage();


        // Example of SerializedSingleton design pattern use problem
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
    }
}
