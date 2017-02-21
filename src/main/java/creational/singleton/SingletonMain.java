package creational.singleton;

/**
 * Created by michal on 21.02.17.
 *
 * http://www.oodesign.com/singleton-pattern.html
 */
public class SingletonMain {
    public static void main(String[] args) {
        SingleObject.getInstance().hello();

        SingleObjectEnum.INSTANCE.hello();
    }
}
