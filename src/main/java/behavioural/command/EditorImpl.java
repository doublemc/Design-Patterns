package behavioural.command;

/**
 * Created by michal on 24.02.17.
 */
// receiver
class EditorImpl implements Editor {
    @Override
    public void save() {
        System.out.println("Saving something");
    }

    @Override
    public void open() {
        System.out.println("Opening something");
    }

    @Override
    public void close() {
        System.out.println("Closing something");
    }
}
