package commands.dataBaseCommands;
import Interfaces.Executable;
import commands.absctractCommands.DataBaseCommand;
import exceptions.CommandException;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class AddIfMinCommand extends DataBaseCommand implements Executable {




    @Override
    public String ExecuteCommand(String... args) {
        return null;
    }

    @Override
    public String getCommandArguments(){
        return " {element}";
    }
}
