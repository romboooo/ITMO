package classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordinates {
    private int x; //Значение поля должно быть больше -101
    private int y;

    public String toString(){
        return String.valueOf(x) +", " + String.valueOf(y);
    }
}