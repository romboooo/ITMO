package classes;

import java.util.Random;

public class GenerateRandomValues {
    static Random random = new Random();

    public static long generateRandomID(){
        return random.nextLong();
    }
    public static long generateRandomDiscount(){
        return random.nextLong();
    }
    public static double generateRandomPrice(){
        return random.nextDouble();
    }
    
}
