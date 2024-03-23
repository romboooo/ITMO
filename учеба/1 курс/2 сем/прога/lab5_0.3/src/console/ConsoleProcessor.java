package console;

import commands.CommandProcessor;
import commands.consoleCommands.ExitCommand;
import lombok.Data;

import java.util.Scanner;
@Data
public class ConsoleProcessor {

    private boolean RuntimeFlag = true;
    private final CommandProcessor commandProcessor;

    public ConsoleProcessor(CommandProcessor commandProcessor) {
        this.commandProcessor = commandProcessor;

        commandProcessor.getCommands().put("exit", new ExitCommand(this));
    }


    public void consoleExecute(){
        System.out.println("Type \"help\" for display available commands:");
        Scanner scanner = new Scanner(System.in);

        while(RuntimeFlag){
            String input = scanner.nextLine();
            System.out.println(commandProcessor.executeCommand(input));

        }
    }
}
