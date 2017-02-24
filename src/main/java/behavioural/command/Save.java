package behavioural.command;

/**
 * Created by michal on 24.02.17.
 */
// concrete command
class Save implements Action{

    private final Editor editor;

    Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
