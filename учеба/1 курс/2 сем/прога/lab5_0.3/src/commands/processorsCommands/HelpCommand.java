package commands.processorsCommands;

import commands.CommandProcessor;
import commands.absctractCommands.ProcessorsCommand;
import exceptions.CommandException;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode
public class HelpCommand extends ProcessorsCommand {
    public HelpCommand(CommandProcessor processor) {
        super(processor);
    }


    @Override
    public String ExecuteCommand(String... args) throws CommandException {
        List<String> AllCommands= new ArrayList<>();
        for (String commandName : processor.getCommands().keySet()){
            AllCommands.add(commandName + "\n");
        }
        return AllCommands.stream().collect(Collectors.joining());
    }
}
