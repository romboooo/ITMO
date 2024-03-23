package commands;

import commands.absctractCommands.Command;
import commands.processorsCommands.HelpCommand;
import exceptions.CommandException;
import lombok.Getter;

import java.util.HashMap;
@Getter
public class CommandProcessor {
    private HashMap<String, Command> commands = new HashMap<>();
    public CommandProcessor(){
        commands.put("help", new HelpCommand(this));


    }


    public String executeCommand(String input){
        String commandName = input.split(" ")[0];

        try {
            return commands.get(commandName).ExecuteCommand((String[]) null);
        } catch (CommandException e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}
