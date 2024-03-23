package classes;
import abstractClasses.Hero;
import abstractClasses.Item;

public class MumiParents extends Hero {
    private final static String NAME = "Муми-папа и Муми-мама ";
    public MumiParents(){
        super(NAME);
    }
    public static void haveFriends(){
        System.out.println("в каждом путешествии обзаводились новыми друзьями и приводили их к себе домой, в " + House.getName());
    }
    public void goToTheBigWorld(){
        System.out.println("по этой реке не раз отправлялись в большой мир навстречу необыкновенным приключениям");
    }
    @Override
    public void toSound() {
    }
    public void recieveFriends(House.Furniture e) { //принимать гостей

        if (e.toString() == "стол "){
            System.out.printf("расширяли обеденный " + e.toString());
        }
        else if (e.toString() == "кровати "){
            System.out.printf("ставили " + e.toString());
        }
        else {
            throw new RuntimeException(this.getName() + "не приняли гостей");
        }
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
    public static void openWindow() {
        System.out.println("распахнули ");
            class Window extends Item {

            private final static String NAME = "окошко ";

            public Window(String name) {
                super(name);
            }

            public String getName() {
                return this.NAME;
            }
        }

    }
}
