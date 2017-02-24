package structural.decorator;

/**
 * Created by michal on 21.02.17.
 */
abstract class IceCreamDecorator implements IceCream {

    protected IceCream specialIcecream;

    public IceCreamDecorator(IceCream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    @Override
    public String makeIceCream() {
        return specialIcecream.makeIceCream();
    }
}
