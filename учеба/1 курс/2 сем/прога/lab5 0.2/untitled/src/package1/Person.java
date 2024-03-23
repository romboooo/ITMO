package package1;

public class Person {
    private java.time.LocalDateTime birthday; //Поле не может быть null
    private int weight; //Значение поля должно быть больше 0
    private String passportID; //Значение этого поля должно быть уникальным, Длина строки должна быть не меньше 4, Поле не может быть null
    private Location location; //Поле не может быть null
}