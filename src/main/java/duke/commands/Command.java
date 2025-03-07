package duke.commands;

import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * The Command class is the skeleton class for all of Duke's command.
 *
 * @author Chia Jeremy
 */

public abstract class Command {
    public abstract void execute(Storage storage, TaskList tasks, Ui ui);
}
