package org.example;

import java.util.PrimitiveIterator;

public class Song {
    private enum Genre{
        UNDEFINED, POP, ROCK, HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE
    }
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public void printInfo(int detailLevel) {

        if (detailLevel >= 0 && detailLevel <= 3) {
            System.out.println("song title: " + title);
            System.out.println("release year: " + releaseYear);
            if (this.genre != Genre.UNDEFINED) {
                System.out.println("genre: " + genre);
            }
        }

        if (detailLevel == 1 || detailLevel == 3) {
            if (!artist.getName().equals("")) {
                System.out.println("artist name: " + artist.getName());
            }
            if (!artist.getAlias().equals("")) {
                System.out.println("artist also known as: " + artist.getAlias());
            }
        }

        if (detailLevel == 2 || detailLevel == 3) {
            if (!album.getName().equals("")) {
                System.out.println("album title: " + album.getName());
            }
        }
    }
}
