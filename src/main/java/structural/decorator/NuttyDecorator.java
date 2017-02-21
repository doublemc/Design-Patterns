package structural.decorator;

/**
 * Created by michal on 21.02.17.
 */
public class NuttyDecorator extends IceCreamDecorator {

    public NuttyDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIceCream() {
        return specialIcecream.makeIceCream() + addNuts();
    }

    private String addNuts() {
        return " + crunchy nuts";
    }
}
