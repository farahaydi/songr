package com.example.songr.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameOfCookie", nullable = false)
    private String title;
    private String artist;
    private int songCount;

    private int length;
    private String imageUrl;
    @OneToMany(mappedBy = "albumy", cascade = CascadeType.ALL)
    private List <Song> songy;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Album() {
        System.out.println("Set Data Correctly");
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public List<Song> getSongy() {
        return songy;
    }

    public void setSongy(List<Song> songy) {
        this.songy = songy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}