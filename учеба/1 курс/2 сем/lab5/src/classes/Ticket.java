package classes;
import enums.TicketType;
import exception.IsBlankException;
import exception.OutOfRangeOfAcceptableValuesException;
import exception.NullException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
public class Ticket {

    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String NAME; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double price; //Значение поля должно быть больше 0
    private Long discount; //Поле не может быть null, Значение поля должно быть больше 0, Максимальное значение поля: 100
    private String comment; //Строка не может быть пустой, Поле может быть null
    private TicketType type; //Поле может быть null
    private Person person; //Поле может быть null


    @Override
    public String toString(){
        return getId() + "; " + getNAME() + "; " + getCoordinates() + "; " + getCreationDate() + "; " + getPrice() + "; " + getDiscount() + "; " + getComment() + "; " + getType() + "; " + getPerson() + "; " ;
    }

        public void setID(Long id) throws NullException, OutOfRangeOfAcceptableValuesException {
        if (id == null) {
            throw new NullException();
        } else if (id <= 0) {
            throw new OutOfRangeOfAcceptableValuesException();
        } else {
            this.id = (long) (Math.random() * Integer.MAX_VALUE);
        }
    }


    public String getCreationDate(){
        return creationDate.toString().split("T")[0];

    }
    public void setNAME(String NAME) throws NullException {
        if (NAME == null) {
            throw new NullException();
        } else if (NAME.isBlank()) {
            throw new NullException();
        } else {
            this.NAME = NAME;
        }
    }

    public void setCoordinates(Coordinates coordinates) throws NullException {
        if (coordinates == null) {
            throw new NullException();
        } else {
            this.coordinates = coordinates;
        }
    }

    public void setCreationDate(java.time.LocalDateTime creationDate) throws NullException {
        if (creationDate == null) {
            throw new NullException();
        } else {
            this.creationDate = creationDate;
        }
    }
    public void setPrice(double price) throws NullException, OutOfRangeOfAcceptableValuesException {
        if (price <= 0) {
            throw new OutOfRangeOfAcceptableValuesException();
        }
        else this.price = price;
    }

    public void setDiscount(Long discount) throws NullException, OutOfRangeOfAcceptableValuesException {
        if((discount > 0) && (discount <= 100)){
            this.discount = discount;
        }
        else {
            throw new OutOfRangeOfAcceptableValuesException();
        }
    }
    public void setComment(String comment) throws IsBlankException {
        if (comment.isBlank()){
            throw new IsBlankException();
        }
        else {
            this.comment = comment;
        }

    }
    public void setTicketType(TicketType type) throws NullException {
        if (type == null) {
            throw new NullException();
        }
        else{
            this.type = type;
        }
    }
    public void setPerson(Person person){
        this.person = person;
    }

    @SneakyThrows
    public void changeValue(String key, String value){

    }

}