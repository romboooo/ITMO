import classes.*;
import enums.TicketType;
import exception.NullException;
import exception.OutOfRangeOfAcceptableValuesException;
import jdk.jshell.execution.Util;

import java.time.LocalDateTime;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws OutOfRangeOfAcceptableValuesException, NullException {
        Ticket ticket;
        ticket = new Ticket(1L,
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
                new Location(3D,4L,"d")));

        System.out.println("Welcome to lab5!");
        System.out.println("Enter 'help' to see all commands");
        Console console = new Console();
        Console.inputCommand();
    }
}