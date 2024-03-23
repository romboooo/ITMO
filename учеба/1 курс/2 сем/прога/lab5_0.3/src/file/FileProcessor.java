package file;

import commands.CommandProcessor;
import commands.fileCommands.ExecuteScriptCommand;
import commands.fileCommands.SaveCommand;
import java.io.*;

public class FileProcessor {

    private final CommandProcessor commandProcessor;
    public static final String CSVFILE = "/Users/rom4ikk/Desktop/учеба/1 курс/2 сем/прога/lab5_0.3/src/file/file.csv";
    public FileProcessor(CommandProcessor commandProcessor){
        this.commandProcessor = commandProcessor;
        commandProcessor.getCommands().put("execute_script", new ExecuteScriptCommand());
        commandProcessor.getCommands().put("save",new SaveCommand());
    }
    public static class Parser {

        public static String csvToString(String CSVFILE, Boolean passFirstString) {

            String returner = "";
            String line;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(CSVFILE)))) {

                while ((line = bufferedReader.readLine()) != null) {
                    if (passFirstString) {
                        passFirstString = false;
                    } else {
                        returner += line + "\n";
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден((");

            } catch (IOException e) {
                e.printStackTrace();
            }
            return returner;
        }
    }

}
