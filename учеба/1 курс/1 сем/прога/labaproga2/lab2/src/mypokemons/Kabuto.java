package mypokemons;

import mymoves.PhysicalMove.Facade;
import mymoves.SpecialMove.Blizzard;
import mymoves.StatusMove.Rest;
import ru.ifmo.se.pokemon.*;
public class Kabuto extends Pokemon {
    public Kabuto(String name, int level){
        super(name,level);
        super.setType(Type.ROCK,Type.WATER);
        super.setStats(30,80,90,55,45,55);
        super.setMove(new Rest(),new Facade(), new Blizzard());
    }
}
