package structural.decorator;

/**
 * Created by michal on 21.02.17.
 */
class HoneyDecorator extends IceCreamDecorator {
    public HoneyDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }


    public String makeIceCream() {
        return specialIcecream.makeIceCream() + addHoney();
    }

    private String addHoney() {
        return " + honey";
    }
}
