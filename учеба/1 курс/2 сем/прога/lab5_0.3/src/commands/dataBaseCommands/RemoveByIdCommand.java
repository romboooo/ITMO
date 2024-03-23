package commands.dataBaseCommands;

import Interfaces.Executable;
import commands.absctractCommands.DataBaseCommand;
import database.DataBase;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import package1.Ticket;

@EqualsAndHashCode
public class RemoveByIdCommand extends DataBaseCommand implements Executable {

    final DataBase dataBase;

    public RemoveByIdCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String ExecuteCommand(String... args){
        if (args == null) {
            return "command expects argument. please try it one more time";
        }

        int id = Integer.valueOf(args[0]);


        for(Ticket ticket : dataBase.tickets){
            if (id == ticket.getId()){
                dataBase.tickets.remove(ticket);
                return "done!";
            }
        }

        return "there isn't ticket with id: " + id;
    }

    @Override
    public String getCommandArguments() {
        return " id";
    }
}
