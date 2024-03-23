package classes;
import abstractClasses.Hero;
import interfaces.Stirable;

public class Sniff extends Hero implements Stirable {
    private final static String NAME = "Снифф ";
    public Sniff(){
        super(NAME);
    }

    @Override
    public void toSound(){
        System.out.printf("перестал храпеть, ");
    }
    public void noStir(){
        System.out.printf("но не шелохнулся. ");
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
    public String toString() {
        return super.toString();
    }
}
