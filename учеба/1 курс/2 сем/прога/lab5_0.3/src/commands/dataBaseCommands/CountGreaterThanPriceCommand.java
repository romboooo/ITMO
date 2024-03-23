package commands.dataBaseCommands;
import commands.absctractCommands.DataBaseCommand;
import exceptions.CommandException;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class CountGreaterThanPriceCommand extends DataBaseCommand {


    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        return null;
    }
}
