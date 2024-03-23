package commands.absctractCommands;


import commands.CommandProcessor;
import commands.absctractCommands.Command;
import exceptions.CommandException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ProcessorsCommand extends Command {

    protected final CommandProcessor processor;


    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        return null;
    }
}
