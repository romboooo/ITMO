package mymoves.StatusMove;
import ru.ifmo.se.pokemon.*;
public class SweetScent extends StatusMove {
    public SweetScent(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected String describe() {
        return "Использует SweetScent";
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.EVASION, -1);
    }
}
