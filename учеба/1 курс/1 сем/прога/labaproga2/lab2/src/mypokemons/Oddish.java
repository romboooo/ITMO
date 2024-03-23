package mypokemons;

import mymoves.StatusMove.*;

import ru.ifmo.se.pokemon.*;
public class Oddish extends Pokemon {
    public Oddish(String name, int level){
        super(name,level);
        super.setStats(45,50,55,75,65,30);
        super.setType(Type.GRASS, Type.POISON);
        super.setMove(new Rest(), new StunSpore());
    }
}
