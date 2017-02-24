package behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 24.02.17.
 */
// client
class Macro {
    private final List<Action> actions;

    Macro() {
        actions = new ArrayList<>();
    }

    void record(Action action) {
        actions.add(action);
    }

    void run() {
        actions.forEach(Action::perform);
    }
}
