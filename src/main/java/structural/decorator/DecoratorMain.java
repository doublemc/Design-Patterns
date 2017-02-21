package structural.decorator;

/**
 * Created by michal on 21.02.17.
 *
 * http://www.oodesign.com/decorator-pattern.html
 */
public class DecoratorMain {
    public static void main(String[] args) {
        IceCream iceCream = new SimpleIceCream();
        System.out.println(iceCream.makeIceCream());

        // decorated with honey
        iceCream = new HoneyDecorator(iceCream);
        System.out.println(iceCream.makeIceCream());

        // decorated with honey and nuts
        iceCream = new NuttyDecorator(iceCream);
        System.out.println(iceCream.makeIceCream());


    }
}
