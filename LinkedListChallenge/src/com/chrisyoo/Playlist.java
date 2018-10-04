package com.chrisyoo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {

    private String name;
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;

    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
        this.playlist = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void addSongs (Song song) {
        if (checkOwnership(song)) {
            playlist.add(song);
            System.out.println("New song added to playlist");
        } else {
            System.out.println("You do not own the song, cannot add to playlist");
        }

    }

    public void addAlbums (Album album) {
        if (checkAlbum(album)) {
            System.out.println("Album already exists, cannot add");
        } else {
            albums.add(album);
            System.out.println("Album successfully added");
        }
    }

    public void removeAlbums (Album album) {
        if (checkAlbum(album)) {
            albums.remove(album);
            System.out.println("Album successfully removed");
        } else {
            System.out.println("Album does not exist, cannot delete");
        }
    }

    private boolean checkOwnership (Song song) {
        for (int i=0; i < albums.size(); i++) {
            for (int j=0; j < albums.get(i).getSongs().size(); j++) {
                if (albums.get(i).getSongs().indexOf(song) >= 0) {
                    return true;
                }
            }

        }
        return false;
    }


    private boolean checkAlbum(Album album) {
        for (int i=0; i < albums.size(); i++) {
                if (albums.get(i).equals(album)) {
                    return true;
                }
        }
        return false;
    }

}
