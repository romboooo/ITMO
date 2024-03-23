package Class;
import Abstract.Hero;
import interfaces.PutSomethingIn;

public class Story {
    public static void tellStory() {
        Hero mumitroll = new MumiTroll();
        Snusmumrik snusmumrik = new Snusmumrik();
        Sniff sniff = new Sniff();
        Garmoshka garmoshka = new Garmoshka();


        snusmumrik.toSound();
        System.out.printf(snusmumrik.getName());
        ((PutSomethingIn) snusmumrik).putIn(garmoshka);

        mumitroll.toSound();

        System.out.print("Слышно было: ");
        System.out.printf(sniff.getName());
        sniff.toSound();
        sniff.noStir();
    }
}
