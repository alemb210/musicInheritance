import java.util.*;
public class Performance extends Music
{
    private String location;
    private String venue;

    public Performance(String genre, String releaseDate, int length, ArrayList<String> trackList, String artist, String location, String venue)
    {
        super(genre, releaseDate, length, trackList, artist);
        this.location = location;
        this.venue = venue;
    }

    public String getLocation()
    {
        return location;
    }

    public String getVenue()
    {
        return venue;
    }

    public void printInfo()
    {
        System.out.println("This is a " + getGenre() + " performance held on " + getReleaseDate() + " by " + getArtist() + " in " + getLocation() + " at the venue " + getVenue() + ". During this performance, " + getTrackList().size() + " tracks were performed over the course of " + getLength() + " minutes. These tracks are: ");
        for(int i = 0; i < getTrackList().size() - 1; i++)
        {
            System.out.print(getTrackList().get(i) + ", ");
        }
        System.out.print("and " + getTrackList().get(getTrackList().size() - 1) + ". ");
    }
}