package creational.factory;

/**
 * Created by michal on 20.02.17.
 */
class Rottweiler implements Dog {
    @Override
    public void speak() {
        System.out.println("The rottweiler says \"rawr\"");
    }
}
