import java.util.*;
public class Album extends Music
{
    private String title;
    private double rating;
    private ArrayList<String> platforms;

    public Album(String genre, String releaseDate, int length, ArrayList<String> trackList, String artist, String title, double rating, ArrayList<String> platforms)
    {
        super(genre, releaseDate, length, trackList, artist);
        this.title = title;
        this.rating = rating;
        this.platforms = platforms;
    }

    public String getTitle()
    {
        return title;
    }

    public double getRating()
    {
        return rating;
    }

    public ArrayList<String> getPlatforms()
    {
        return platforms;
    }

    public void printInfo()
    {
        System.out.println("This is a " + getGenre() + " album called " + getTitle() + " by " + getArtist() + ". It released " + getReleaseDate() + " and has garnered a rating of " + getRating() + " since. This album boasts " + getTrackList().size() + " tracks over the course of " + getLength() + " minutes. These tracks are: ");
        for(int i = 0; i < getTrackList().size() - 1; i++)
        {
            System.out.print(getTrackList().get(i) + ", ");
        }
        System.out.print("and " + getTrackList().get(getTrackList().size() - 1) + ". ");
        System.out.print("This album is available on: ");
        for(int i = 0; i < getPlatforms().size() - 1; i++)
        {
            System.out.print(getPlatforms().get(i) + ", ");
        }
        System.out.print("and " + getPlatforms().get(getPlatforms().size() - 1) + ". ");
    }
}