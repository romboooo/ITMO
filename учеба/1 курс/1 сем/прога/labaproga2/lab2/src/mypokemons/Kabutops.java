package mypokemons;

import mymoves.PhysicalMove.Slash;
import ru.ifmo.se.pokemon.*;
public class Kabutops extends Kabuto {
    public Kabutops(String name, int level){
        super(name,level);
        setType(Type.ROCK, Type.WATER);
        setStats(60,115,105,65,70,80);
        addMove(new Slash());
    }
}
