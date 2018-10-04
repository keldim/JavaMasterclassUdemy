package com.chrisyoo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("song1", "5:00");
        Song song2 = new Song("song2", "5:00");
        Song song3 = new Song("song3", "5:00");
        Song song4 = new Song("song4", "5:00");
        Song song5 = new Song("song5", "5:00");
        Song song6 = new Song("song6", "5:00");
        Song song7 = new Song("song7", "5:00");
        Song song8 = new Song("song8", "5:00");
        Song song9 = new Song("song9", "5:00");
        Song song10 = new Song("song10", "5:00");
        Song song11 = new Song("song11", "5:00");
        Song song12 = new Song("song12", "5:00");

        Album album1 = new Album("album1");
        Album album2 = new Album("album2");
        Album album3 = new Album("album3");

        Playlist playlist = new Playlist("playlist");


        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song3);
        album1.addSong(song4);

        album2.addSong(song5);
        album2.addSong(song6);
        album2.addSong(song7);
        album2.addSong(song8);

        album3.addSong(song9);
        album3.addSong(song10);
        album3.addSong(song11);
        album3.addSong(song12);

        playlist.addAlbums(album1);
        playlist.addAlbums(album2);
        playlist.addAlbums(album3);

        playlist.addSongs(song1);
        playlist.addSongs(song6);
        playlist.addSongs(song3);
        playlist.addSongs(song2);
        playlist.addSongs(song12);
        playlist.addSongs(song10);
        playlist.addSongs(song11);

        visit(playlist.getPlaylist());
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - list all songs\n" +
                "2 - next song\n" +
                "3 - previous song\n" +
                "4 - replay current song\n" +
                "5 - delete current song\n" +
                "6 - print menu options");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> i = playlist.iterator();
        while (i.hasNext()) {
            System.out.println("Now playing " + i.next().getTitle());
        }
        System.out.println("====================");
    }

    private static void visit(LinkedList songs) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = songs.listIterator();

        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Exiting playlist");
                    quit = true;
                    break;

                case 1:
                    printList(songs);
                    break;


                case 2:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 4:
                    if (goingForward) {
                        goingForward = false;
                        System.out.println("Now visiting " + listIterator.previous().getTitle());
                    } else {
                        goingForward = true;
                        System.out.println("Now visiting " + listIterator.next().getTitle());
                    }
                    break;

                case 5:
                    if (listIterator.hasNext()) {
                        if (goingForward) {
                            listIterator.remove();
                            System.out.println("Now visiting " + listIterator.next().getTitle());
                        } else {
                            listIterator.remove();
                            goingForward = true;
                            System.out.println("Now visiting " + listIterator.next().getTitle());
                        }

                    } else {
                        if (goingForward) {
                            listIterator.remove();
                            goingForward = false;
                            System.out.println("Now visiting " + listIterator.previous().getTitle());
                        } else {
                            listIterator.remove();
                            System.out.println("Now visiting " + listIterator.previous().getTitle());
                        }
                    }
                    break;


                case 6:
                    printMenu();
                    break;
            }

        }


    }
}
