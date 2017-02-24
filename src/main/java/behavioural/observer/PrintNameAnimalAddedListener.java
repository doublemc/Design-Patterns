package behavioural.observer;

/**
 * Created by michal on 17.02.17.
 */
class PrintNameAnimalAddedListener implements AnimalAddedListener {
    @Override
    public void onAnimalAdded(Animal animal) {
        // Print the name of the newly added animal
        System.out.println("Added a new animal with name: " + animal.getName());
    }
}
