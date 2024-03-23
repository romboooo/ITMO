package mymoves.PhysicalMove;
import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
    @Override
    protected void applyOppDamage(Pokemon def,double damage) {
        super.applyOppDamage(def,damage);
        if ((def.getCondition() == Status.BURN) || (def.getCondition() == Status.POISON) || (def.getCondition() == Status.PARALYZE)){
            def.setMod(Stat.HP, 140);
        }
    }
}
