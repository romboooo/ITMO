package package1;

import lombok.Data;

@Data
public class Ticket {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long price; //Поле не может быть null, Значение поля должно быть больше 0
    private int discount; //Значение поля должно быть больше 0, Максимальное значение поля: 100
    private String comment; //Строка не может быть пустой, Поле может быть null
    private TicketType type; //Поле может быть null
    private Person person; //Поле может быть null
}