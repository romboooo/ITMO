package mymoves.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON,90,100);
    }
    @Override
    protected String describe() {
        return "Использует Sludge Bomb";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.poison(p);
    }
}

