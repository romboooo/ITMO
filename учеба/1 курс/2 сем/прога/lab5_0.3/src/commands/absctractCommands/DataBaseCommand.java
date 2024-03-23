package commands.absctractCommands;

import commands.absctractCommands.Command;
import exceptions.CommandException;

import java.io.FileNotFoundException;

public abstract class DataBaseCommand extends Command {
    @Override
    public String ExecuteCommand(String... args) throws CommandException, FileNotFoundException {
        return null;
    }
}
