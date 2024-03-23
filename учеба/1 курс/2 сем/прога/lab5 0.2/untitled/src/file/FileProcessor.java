package file;

import commands.CommandProcessor;
import commands.fileCommands.ExecuteScriptCommand;
import commands.fileCommands.SaveCommand;

public class FileProcessor {

    private final CommandProcessor commandProcessor;
    public FileProcessor(CommandProcessor commandProcessor){
        this.commandProcessor = commandProcessor;
        commandProcessor.getCommands().put("execute_script", new ExecuteScriptCommand());
        commandProcessor.getCommands().put("save",new SaveCommand());
    }
}
