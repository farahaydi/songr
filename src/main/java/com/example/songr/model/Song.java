package com.example.songr.model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long songId;
    @Column(name = "title")
    private String songTitle;
    @Column(name = "length")
    private int songLength;
    private int trackNumber;
    @ManyToOne
    private Album album;

    public Song() {
    }

    public Song(String songTitle, int songLength, int trackNumber, Album album) {
        this.songTitle = songTitle;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public String getTitle() {
        return songTitle;
    }

    public void setTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getLength() {
        return songLength;
    }

    public void setLength(int songLength) {
        this.songLength = songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album =album;
}
}