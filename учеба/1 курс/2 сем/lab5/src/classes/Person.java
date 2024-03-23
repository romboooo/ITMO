package classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Person {
    private java.util.Date birthday; //Поле не может быть null
    private float weight; //Значение поля должно быть больше 0
    private String passportID; //Значение этого поля должно быть уникальным, Длина строки должна быть не меньше 4, Поле не может быть null
    private Location location; //Поле не может быть null

    @Override
    public String toString(){
        return getBirthday() + "; " + getWeight() + "; " + getPassportID() + "; " + getLocation();
    }
}