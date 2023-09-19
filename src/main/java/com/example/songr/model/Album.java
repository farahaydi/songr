package com.example.songr.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long albumId;
    @Column(name = "title")
    private String albumTitle;
    private String artist;
    private int songCount;
    @Column(name = "length")
    private int albumLength;
    private String imageUrl;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public Album(String albumTitle, String artist, int songCount, int albumLength, String imageUrl) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songCount = songCount;
        this.albumLength = albumLength;
        this.imageUrl = imageUrl;
    }

    public Album() {
    }

    public String getTitle() {
        return albumTitle;
    }

    public void setTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return albumLength;
    }

    public void setLength(int albumLength) {
        this.albumLength = albumLength;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Long getId() {return albumId;}

}
