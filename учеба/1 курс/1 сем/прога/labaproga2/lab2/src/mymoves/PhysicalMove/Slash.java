package mymoves.PhysicalMove;
import ru.ifmo.se.pokemon.*;
public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected String describe() {
        return "Использует Slash";
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1d/8d;
    }
}
