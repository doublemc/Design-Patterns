package behavioural.observer;

/**
 * Created by michal on 17.02.17.
 *
 * http://www.oodesign.com/observer-pattern.html
 */
public class ObserverMain {
    public static void main(String[] args) {
        // Create the zoo to store animals
        Zoo zoo = new Zoo();

        // Register a listener to be notified when an animal is added
        PrintNameAnimalAddedListener printNameAnimalAddedListener = new PrintNameAnimalAddedListener();
        zoo.registerAnimalAddedListener(printNameAnimalAddedListener);
        CountingAnimalAddedListener countingAnimalAddedListener = new CountingAnimalAddedListener();
        zoo.registerAnimalAddedListener(countingAnimalAddedListener);

        // Registering third listener using lambda - cannot unregister as it is anonymous class
        zoo.registerAnimalAddedListener(
                (animal -> System.out.println("(Lambda class) Added a new animal with name: " + animal.getName()))
        );

        // Add an animal and thus notify the registered listeners
        zoo.addAnimal(new Animal("Bear"));
        zoo.addAnimal(new Animal("Tiger"));
        zoo.addAnimal(new Animal("Elephant"));

        // Remove counting listener
        zoo.unregisterAnimalAddedListener(countingAnimalAddedListener);

        // Only printing name listener is notified
        zoo.addAnimal(new Animal("Elephant"));

    }
}
