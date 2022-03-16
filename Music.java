import java.util.*;
public class Music
{
    private String genre;
    private String releaseDate;
    private int length;
    private ArrayList<String> trackList;
    private String artist;

    public Music(String genre, String releaseDate, int length, ArrayList<String> trackList, String artist)
    {
     this.genre = genre;
     this.releaseDate = releaseDate;
     this.length = length;
     this.trackList = trackList;
     this.artist = artist;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getReleaseDate()
    {
        return releaseDate;
    }

    public int getLength()
    {
        return length;
    }

    public ArrayList<String> getTrackList()
    {
        return trackList;
    }

    public String getArtist()
    {
        return artist;
    }

    public void printInfo()
    {
        System.out.println("This work of " + getGenre() + " music is by " + getArtist() + ", who released it on " + getReleaseDate() + ". It contains " + getTrackList().size() + " tracks, which run for a total of " + getLength() + " minutes. These tracks are: ");
        for(int i = 0; i < getTrackList().size() - 1; i++)
        {
            System.out.print(getTrackList().get(i) + ", ");
        }
        System.out.print("and " + getTrackList().get(getTrackList().size() - 1) + ". ");
    }
}
