package mymoves.SpecialMove;
import ru.ifmo.se.pokemon.*;
public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE,110,70);
    }
    @Override
    protected String describe() {
        return "Использует Blizzard";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).condition(Status.FREEZE);
        p.setCondition(e);
    }
}

