package classes;

import abstractClasses.Hero;
import interfaces.PutSomethingIn;
import exceptions.*;

import java.lang.reflect.Field;

public class Story {
    public static void tellStory() throws StoryIsEmpty, NoSuchFieldException {
        MumiParents mumiParents = new MumiParents();
        Hero mumitroll = new MumiTroll();
        Snusmumrik snusmumrik = new Snusmumrik();
        Sniff sniff = new Sniff();
        Accordion accordion = new Accordion();
        House house = new House();
        House.Furniture furniture = new House.Furniture(); // экземпляр static класса
        House.Things things = house.new Things();   // экземпляр no-static класса
        House.People people = new House.People();
        House.Window window = house.new Window("окошко");

        System.out.printf(mumiParents.getName());
        mumiParents.goToTheBigWorld();
        mumiParents.haveFriends();

        System.out.println(mumiParents.getName() + "принимали всех незнакомцев с невозмутимым спокойствием - ");

        mumiParents.recieveFriends(new House.Furniture() {

            private final static String NAME = "стол ";

            @Override
            public String toString() {
                return NAME;
            }

        });
        mumiParents.recieveFriends(new House.Furniture() {
            private final static String NAME = "кровати ";

            @Override
            public String toString() {
                return NAME;
            }

        });
        people.doWhateverWant();
        people.noComplain();
        things.be();

        snusmumrik.toSound();
        System.out.printf(snusmumrik.getName());
        ((PutSomethingIn) snusmumrik).putIn(accordion);

        mumitroll.toSound();

        System.out.print("Слышно было: ");
        System.out.printf(sniff.getName());
        sniff.toSound();
        sniff.noStir();

        System.out.printf(mumiParents.getName());
        mumiParents.openWindow();
        System.out.printf(window.getName());

        String s1 = "Машусик the best";
        String s2 = new String ("Машусик the best");
        System.out.println(s1 == s2);





    }
}

