package database;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import commands.CommandProcessor;
import commands.dataBaseCommands.*;
import file.FileProcessor;
import package1.Ticket;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


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
    public static String getTicketFields() throws FileNotFoundException {
        List<Ticket> beans = new CsvToBeanBuilder<Ticket>(new CSVReader(new FileReader(FileProcessor.CSVFILE)))
                .withType(Ticket.class)
                .build()
                .parse();
        StringBuilder builder = new StringBuilder();
                beans.forEach(ticket -> {
                    builder.append(ticket + "\n");
                });
        return builder.toString();
    }


 }
