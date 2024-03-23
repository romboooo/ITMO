package commands.dataBaseCommands;

import commands.absctractCommands.DataBaseCommand;
import database.DataBase;
import exceptions.CommandException;
import file.FileProcessor;
import lombok.EqualsAndHashCode;

import java.io.FileNotFoundException;

import static javax.print.attribute.standard.ReferenceUriSchemesSupported.FILE;

@EqualsAndHashCode
public class ShowCommand extends DataBaseCommand {


    @Override
    public String ExecuteCommand(String... args) throws CommandException, FileNotFoundException {

        String result = DataBase.getTicketFields();

        return result;
    }
}
