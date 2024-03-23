package classes;
import abstractClasses.Item;
public class House {
    private final static String NAME = "муми-дол ";
    public static String getName(){
        return NAME;
    }
    public static class Furniture{
    }
    public class Things{
        public void be(){
            System.out.println("время от времени в доме случались потрясающие, прямо-таки ужасные вещи ");
        }

    }
    public static class People {
        public static void doWhateverWant(){
            System.out.println("Так вот и выходило, что в "
                    + House.getName() +
                    " всегда было полно народу и каждый занимался чем хотел,нисколько не заботясь о завтрашнем дне. ");
        }
        public static void noComplain(){
            System.out.println("но зато уж на скуку никто пожаловаться не мог. ");
        }

    }
    class Window extends Item {

        private final static String NAME = "окошко ";
        public void open(){
            System.out.println("с треском распахнулось.");
        }
        public Window(String name) {
            super(name);
        }
        public String getName(){
            return this.NAME;
        }
    }

    @Romch
    int x = 5;
}

