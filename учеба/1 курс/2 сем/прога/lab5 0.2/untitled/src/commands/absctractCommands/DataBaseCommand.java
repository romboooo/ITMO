package commands.absctractCommands;

import commands.absctractCommands.Command;
import exceptions.CommandException;

public abstract class DataBaseCommand extends Command {
    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        return null;
    }
}
