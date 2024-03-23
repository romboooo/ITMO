import commands.CommandProcessor;
import console.ConsoleProcessor;
import database.DataBase;
import file.FileProcessor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CommandProcessor commandProcessor = new CommandProcessor();
        DataBase dataBase = new DataBase(commandProcessor);
        ConsoleProcessor consoleProcessor = new ConsoleProcessor(commandProcessor);
        FileProcessor fileProcessor = new FileProcessor(commandProcessor);

        consoleProcessor.consoleExecute();
    }
}