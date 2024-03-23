package mypokemons;

import ru.ifmo.se.pokemon.*;
public class Vileplume extends Gloom {
    public Vileplume(String name, int level){
        super(name,level);
        setType(Type.GRASS,Type.POISON);
        setStats(75,80,85,110,90,50);
    }
}
