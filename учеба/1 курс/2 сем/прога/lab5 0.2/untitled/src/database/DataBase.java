package database;

import commands.CommandProcessor;
import commands.dataBaseCommands.*;


public class DataBase {

    private final CommandProcessor commandProcessor;
    public DataBase(CommandProcessor commandProcessor){
        this.commandProcessor = commandProcessor;
        commandProcessor.getCommands().put("add", new AddCommand());
        commandProcessor.getCommands().put("add_if_max", new AddIfMaxCommand());
        commandProcessor.getCommands().put("add_if_min", new AddIfMinCommand());
        commandProcessor.getCommands().put("clear", new ClearCommand());
        commandProcessor.getCommands().put("count_greater_than_price", new CountGreaterThanPriceCommand());
        commandProcessor.getCommands().put("filter_greater_than_comment", new FilterGreaterThanCommentCommand());
        commandProcessor.getCommands().put("info", new InfoCommand());
        commandProcessor.getCommands().put("print_field_descending_price", new PrintFieldDescendingPriceCommand());
        commandProcessor.getCommands().put("remove_by_id", new RemoveByIdCommand());
        commandProcessor.getCommands().put("remove_first", new RemoveFirstCommand());
        commandProcessor.getCommands().put("show", new ShowCommand());
        commandProcessor.getCommands().put("update_id", new UpdateIdCommand());


    }

 }
