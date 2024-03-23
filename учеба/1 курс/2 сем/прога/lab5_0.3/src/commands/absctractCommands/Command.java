package commands.absctractCommands;

import exceptions.CommandException;

import java.io.FileNotFoundException;

public abstract class Command {
    public abstract String ExecuteCommand(String... args) throws CommandException, FileNotFoundException;
    String GET_ARGS_DESCRIPTION;
}
