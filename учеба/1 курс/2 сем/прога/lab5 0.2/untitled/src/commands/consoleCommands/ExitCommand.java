package commands.consoleCommands;

import commands.absctractCommands.ConsoleCommand;
import console.ConsoleProcessor;
import exceptions.CommandException;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode

public class ExitCommand extends ConsoleCommand {


    public ExitCommand(ConsoleProcessor consoleProcessor) {
        super(consoleProcessor);
    }


    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        consoleProcessor.setRuntimeFlag(false);

        return "";
    }


}
