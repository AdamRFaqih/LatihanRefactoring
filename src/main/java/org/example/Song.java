package org.example;

public class Song {
    public enum Genre{
        UNDEFINED, POP, ROCK, HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE
    }
    public enum DetailLevel {
        SONGONLY, SONGARTIST, SONGALBUM, SONGDETAIL
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
    public void printInfo(DetailLevel detailLevel) {
        System.out.println("song title: " + title);
        System.out.println("release year: " + releaseYear);
        if (this.genre != Genre.UNDEFINED) {
            System.out.println("genre: " + genre);
        }

        if (detailLevel == DetailLevel.SONGARTIST || detailLevel == DetailLevel.SONGDETAIL) {
            artist.printInfo();
        }

        if (detailLevel == DetailLevel.SONGALBUM || detailLevel == DetailLevel.SONGDETAIL) {
            album.printInfo();
        }
    }
}
