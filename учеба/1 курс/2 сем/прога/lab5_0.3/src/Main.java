
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import commands.CommandProcessor;
import console.ConsoleProcessor;
import database.DataBase;
import file.FileProcessor;
import package1.Person;
import package1.Ticket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;




public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CommandProcessor commandProcessor = new CommandProcessor();
        DataBase dataBase = new DataBase(commandProcessor);
        ConsoleProcessor consoleProcessor = new ConsoleProcessor(commandProcessor);
        FileProcessor fileProcessor = new FileProcessor(commandProcessor);
        FileProcessor.Parser parser = new FileProcessor.Parser();
        Person person = new Person();



        consoleProcessor.consoleExecute();
    }
}