import java.util.*;
public class MusicRunner
{
    public static void main (String[] args)
    {
        System.out.println("Testing superclass Music \n-----------------------------");
        ArrayList<String> tL = new ArrayList<String>();
        tL.add("track one");
        tL.add("track two");
        tL.add("track three");
        Music goodMusic = new Music("rock", "February 10, 2005", 41, tL, "RockStar");
        goodMusic.printInfo();

        System.out.println("\nTesting subclass Album \n-----------------------------");
        ArrayList<String> platforms = new ArrayList<String>();
        platforms.add("Apple Music");
        platforms.add("Spotify");
        platforms.add("Youtube");
        Album goodAlbum = new Album("rock", "February 10, 2005", 41, tL, "RockStar", "Rock On", 4.2, platforms);
        goodAlbum.printInfo();

        System.out.println("\nTesting subclass Performance \n-----------------------------");
        Performance goodConcert = new Performance("rock", "February 10, 2005", 41, tL, "RockStar", "New York", "Madison Square Garden");
        goodConcert.printInfo();





    }
}
