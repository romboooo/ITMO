package commands.absctractCommands;

import commands.absctractCommands.Command;
import console.ConsoleProcessor;
import exceptions.CommandException;

public abstract class ConsoleCommand extends Command {
    protected final ConsoleProcessor consoleProcessor;

    protected ConsoleCommand(ConsoleProcessor consoleProcessor) {
        this.consoleProcessor = consoleProcessor;
    }

    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        return null;
    }
}
