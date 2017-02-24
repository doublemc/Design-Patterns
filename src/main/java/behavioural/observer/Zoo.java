package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 17.02.17.
 */
class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<AnimalAddedListener> listeners = new ArrayList<>();

    public void addAnimal(Animal animal) {
        // Add the animal to the list of animals
        this.animals.add(animal);

        // Notify the list of registered listeners
        notifyAnimalAddedListeners(animal);
    }

    public void registerAnimalAddedListener(AnimalAddedListener listener) {
        // Add the listener to the list of registered listeners
        this.listeners.add(listener);
    }

    public void unregisterAnimalAddedListener(AnimalAddedListener listener) {
        // Remove the listener from the list of registered listeners
        this.listeners.remove(listener);
    }

    private void notifyAnimalAddedListeners(Animal animal) {
        // Notify each of the listeners in the list of registered listeners
        this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
    }
}
