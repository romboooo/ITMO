package classes;
import abstractClasses.*;
import interfaces.PutSomethingIn;
import java.util.ArrayList;
import java.util.List;
public class Snusmumrik extends Hero implements PutSomethingIn {

    private final static String NAME = "снусмумрик ";
    public Snusmumrik(){
        super(NAME);
    }
    @Override
    public void toSound(){
        System.out.println("Доиграв последнюю строчку своей весенней песенки, ");
    }
    private List<Item> packet = new ArrayList<>();  //создаем для снуса карман - массивчик для классов item

    @Override
    public void putIn(Item item) {   //выполняем метод путин -> кладём какой нибудь item в карман
        packet.add(item);
        System.out.printf("Положил в карман " + item);

    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Romch
    int x = 5;
}
