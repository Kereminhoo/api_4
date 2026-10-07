package be.condorcet.demo1.model;

import java.util.List;

public class Playlist {

    private String name;
    private String owner;
    private List<Song> songs;

    public Playlist(String name, String owner, List<Song> songs) {
        this.name = name;
        this.owner = owner;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<Song> getSongs() {
        return songs;
    }
}