package creational.factory;

/**
 * Created by michal on 20.02.17.
 */
class Poodle implements Dog {

    @Override
    public void speak() {
        System.out.println("The poodle says \"woof\"");
    }
}
