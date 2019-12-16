package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumTitle;
    private String artist;
    private LinkedList<Song> songs;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songs = new LinkedList<>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for(Song checkedSong : this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
}
