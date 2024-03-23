package commands.fileCommands;
import commands.absctractCommands.FileCommand;
import exceptions.CommandException;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class SaveCommand extends FileCommand {


    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        return null;
    }
}
