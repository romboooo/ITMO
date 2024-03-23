package commands.absctractCommands;

import exceptions.CommandException;

public abstract class Command {
    public abstract String ExecuteCommand(String... args) throws CommandException;
    String GET_ARGS_DESCRIPTION;
}
