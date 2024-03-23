package classes;
import enums.TicketType;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Date;


public class DataBase {
    static ArrayDeque<Ticket> dataBase = new ArrayDeque<>();
    public static void addTicket(){
        dataBase.add(new Ticket(1L,
                "rom4",
                new Coordinates(3,5),
                LocalDateTime.now(),
                3151D,
                224L,
                "comment",
                TicketType.CHEAP,
                new Person(new Date(105,11,3, 12, 54, 33),
                80,
                "qwerty",
                new Location(3D,4L,"d"))));
    }
    public static void getValues(){
        DataBase.addTicket();
        for (Ticket ticket : DataBase.dataBase) {
            System.out.println(ticket.toString());
        }
    }
    public static void getFields(){

    }

}
