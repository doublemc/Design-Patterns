package behavioural.command;

/**
 * Created by michal on 24.02.17.
 */
// concrete command
class Close implements Action {

    private final Editor editor;

    Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
