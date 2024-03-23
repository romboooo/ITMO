package enums;

public enum Whistlable {
    SIMPLE_WHISTLE("простой свист "),
    LONG_WHISTLE("долгий свист");
     public final String description;
     Whistlable(String description) {
         this.description = description;
     }
}
