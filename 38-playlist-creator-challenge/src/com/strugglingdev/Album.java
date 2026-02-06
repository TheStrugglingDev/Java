package com.strugglingdev;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();   // IMPORTANT
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false; // already exists
        }
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1; // track numbers start at 1
        if (index < 0 || index >= songs.size()) {
            return false;
        }
        playList.add(songs.get(index));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song == null) {
            return false;
        }
        playList.add(song);
        return true;
    }
}
