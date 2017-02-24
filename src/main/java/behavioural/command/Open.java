package behavioural.command;

/**
 * Created by michal on 24.02.17.
 */
// concrete command
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
