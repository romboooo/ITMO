package mypokemons;

import mymoves.PhysicalMove.Crunch;
import mymoves.SpecialMove.SludgeBomb;
import mymoves.StatusMove.*;
import ru.ifmo.se.pokemon.*;
public class Seviper extends Pokemon {
    public Seviper(String name, int level){
        super(name,level);
        super.setType(Type.POISON);
        super.setStats(73,100,60,100,60,65);
        super.setMove(new DoubleTeam(),new Crunch(),new SludgeBomb(),new Rest());
    }
}
