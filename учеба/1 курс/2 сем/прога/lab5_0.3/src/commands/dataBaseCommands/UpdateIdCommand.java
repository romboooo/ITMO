package commands.dataBaseCommands;
import Interfaces.Executable;
import commands.absctractCommands.DataBaseCommand;
import database.DataBase;
import lombok.EqualsAndHashCode;
import package1.Ticket;

@EqualsAndHashCode
public class UpdateIdCommand extends DataBaseCommand implements Executable {

    final DataBase dataBase;




    public UpdateIdCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String ExecuteCommand(String... args)  {
        if (args == null) {
            return "command expects argument. please try it one more time";
        }
        int oldID = Integer.parseInt(args[0]);
        int newID = Integer.parseInt(args[1]);


        for(Ticket ticket : dataBase.tickets){
            if(ticket.getId() == oldID){
                if (newID != ticket.getId()){
                    ticket.setId(newID);
                    return "done!";
                }else{
                    return "sorry, id: " + newID + "is already used";
                }

            }

        }

        return "sorry,there is no ticket with id: " + oldID;
    }

    @Override
    public String getCommandArguments() {
        return " {oldID} {newID}";
    }
}
