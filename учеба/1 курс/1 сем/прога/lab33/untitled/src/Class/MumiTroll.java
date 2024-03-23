package Class;
import Abstract.Hero;
import enums.Whistlable;

public class MumiTroll extends Hero {

    private final static String NAME = "Муми-тролль";
    public MumiTroll(){
        super(NAME);
    }
    @Override
    public void toSound(){    //метод свиста по тайной системе
        String out = "Свистнул так: ";

        for (Whistlable whistle : SecretSystem) {
                out += whistle.description;
            }


        System.out.println(out);
        System.out.println("это значит: есть дело ");
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString()  {
        return super.toString();
    }
}

