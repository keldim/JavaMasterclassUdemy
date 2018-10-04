package com.chrisyoo;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;


    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    private boolean findSong (Song song) {
        for (int i=0; i < songs.size(); i++) {
            if (songs.get(i).equals(song)) {
                return true;
            }
        }
        return false;
    }

    public void addSong (Song song) {
        if (findSong(song)) {
            System.out.println("Song already exists, cannot add");
        } else {
            songs.add(song);
            System.out.println("Song successfully added");
        }

    }

    public void removeSong (Song song) {
        if (!findSong(song)) {
            System.out.println("Such song does not exist, cannot remove");
        } else {
            songs.remove(song);
            System.out.println("Song successfully removed");
        }
    }
}
