package commands.fileCommands;
import Interfaces.Executable;
import commands.absctractCommands.FileCommand;
import exceptions.CommandException;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ExecuteScriptCommand extends FileCommand implements Executable {


    @Override
    public String ExecuteCommand(String... args)  {
        return null;
    }

    @Override
    public String getCommandArguments() {
        return " {file_name}";
    }
}
