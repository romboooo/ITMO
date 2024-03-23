package mymoves.StatusMove;
import ru.ifmo.se.pokemon.*;
public class StunSpore extends StatusMove {
    public StunSpore() {
        super(Type.GRASS, 0, 75);
    }
    @Override
    protected String describe() {
        return "Использует Stunspore";
    }
    public void applyOppEffects(Pokemon p) {
        if (p.hasType(Type.ELECTRIC) == false) {
            if (Math.random() <= 0.25) {
                Effect.paralyze(p);
            }
        }
    }
}
