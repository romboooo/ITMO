package package1;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.Data;

import java.util.List;

@Data
public class Person {
    @CsvBindByName
    private java.time.LocalDateTime birthday; //Поле не может быть null
    @CsvBindByName
    private int weight; //Значение поля должно быть больше 0
    @CsvBindByName
    private String passportID; //Значение этого поля должно быть уникальным, Длина строки должна быть не меньше 4, Поле не может быть null
    @CsvBindByName
    private Location location; //Поле не может быть null


}