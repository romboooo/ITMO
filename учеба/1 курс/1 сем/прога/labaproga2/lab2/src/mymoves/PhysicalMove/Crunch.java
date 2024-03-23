package mymoves.PhysicalMove;
import ru.ifmo.se.pokemon.*;
public class Crunch extends PhysicalMove {
    public Crunch(){
        super(Type.DARK,80,100);
    }
    @Override
    protected String describe() {
        return "Использует Crunch";
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2).stat(Stat.DEFENSE, -1);
        p.setCondition(e);
    }
}
