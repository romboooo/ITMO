package labb2;

import mypokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Seviper Seviper = new Seviper("Seviper",1);
        Kabuto Kabuto = new Kabuto("Kabuto",1);
        Kabutops Kabutops = new Kabutops("Kabutops",1);
        Oddish Oddish = new Oddish("Oddish",1);
        Gloom Gloom = new Gloom("Gloom",1);
        Vileplume Vileplume = new Vileplume("Vileplume",1);

        b.addAlly(Kabuto);
        b.addAlly(Kabutops);
        b.addAlly(Seviper);
        b.addFoe(Oddish);
        b.addFoe(Gloom);
        b.addFoe(Vileplume);
        b.go();
    }
}
