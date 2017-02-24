package creational.singleton;

/**
 * Created by michal on 21.02.17.
 */

// thread-safe singleton - best way
enum SingleObjectEnum {
    INSTANCE;

    public void hello() {
        System.out.println("Hello from singleton using enum");
    }
}
