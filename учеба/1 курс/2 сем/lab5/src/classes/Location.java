package classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private Double x; //Поле не может быть null
    private Long y; //Поле не может быть null
    private String name; //Строка не может быть пустой, Поле может быть null

    @Override
    public String toString(){
        return getX() + "; " + getY() + "; " + getName();
    }
}