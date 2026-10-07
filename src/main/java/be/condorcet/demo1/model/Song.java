package be.condorcet.demo1.model;

public class Song {

    private String title;
    private String artist;
    private String url;
    private boolean favorite;

    public Song(String title, String artist, String url, boolean favorite) {
        this.title = title;
        this.artist = artist;
        this.url = url;
        this.favorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getUrl() {
        return url;
    }

    public boolean isFavorite() {
        return favorite;
    }
}