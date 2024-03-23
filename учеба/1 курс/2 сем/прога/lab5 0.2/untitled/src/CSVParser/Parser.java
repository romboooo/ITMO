package CSVParser;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class Parser {

    String csvPath = "/Users/rom4ikk/Desktop/учеба/1 курс/2 сем/прога/lab5 0.2/untitled/Files/File.csv";
    CSVParser csvParser;


    public Parser(){
        try {
            File file = new File(csvPath);
            csvParser = CSVParser.parse(file, Charset.defaultCharset(),CSVFormat.DEFAULT);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
