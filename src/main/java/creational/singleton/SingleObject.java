package creational.singleton;

/**
 * Created by michal on 21.02.17.
 */
// this implementation isn't thread safe -> possible race condition
// using ENUM is better

public class SingleObject {
    // create an object of SingleObject class
    private static SingleObject instance = new SingleObject();

    // constructor private so this class cannot be instantiated
    private SingleObject() {}

    // get the only instance available
    public static SingleObject getInstance() {
        return instance;
    }

    public void hello() {
        System.out.println("Hello from singleton using static field and private constructor");
    }
}
