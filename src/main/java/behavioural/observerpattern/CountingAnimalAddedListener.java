package behavioural.observerpattern;

/**
 * Created by michal on 17.02.17.
 */
public class CountingAnimalAddedListener implements AnimalAddedListener {
    private static int animalsAddedCount = 0;

    @Override
    public void onAnimalAdded(Animal animal) {
        // Increment the numbber of animals
        animalsAddedCount++;

        // Print the number of animals
        System.out.println("Total animals added: " + animalsAddedCount);
    }
}
