package behavioural.command;

/**
 * Created by michal on 24.02.17.
 *
 * http://www.oodesign.com/command-pattern.html
 */
class CommandMain {
    public static void main(String[] args) {
        Macro macro = new Macro();
        Editor editor = new EditorImpl();
        macro.record(editor::open);
        macro.record(editor::save);
        macro.record(editor::close);
        macro.run();
    }
}
