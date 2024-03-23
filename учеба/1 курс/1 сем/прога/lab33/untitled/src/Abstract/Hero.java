package Abstract;
import enums.Whistlable;
import interfaces.Soundable;

public abstract class Hero implements Soundable {
    private String name;
    @Override
    public abstract void toSound();
    public Hero(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    public final Whistlable[] SecretSystem = {
            Whistlable.SIMPLE_WHISTLE,
            Whistlable.SIMPLE_WHISTLE,
            Whistlable.SIMPLE_WHISTLE,
            Whistlable.LONG_WHISTLE
    };
}