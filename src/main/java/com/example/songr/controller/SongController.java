package com.example.songr.controller;

import com.example.songr.exception.AlbumNotFoundException;
import com.example.songr.model.Album;
import com.example.songr.model.Song;
import com.example.songr.repositores.AlbumReopsitores;
import com.example.songr.repositores.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    AlbumReopsitores albumRepo;
    @Autowired
    SongRepository songRepo;

    @GetMapping("/songs")
    public String getSongs(Model model){
        List<Song> songs=songRepo.findAll();
        model.addAttribute("songs",songs);
        return "songs.html";
    }

    @GetMapping("/albums/{id}/addSong")
    public String getAddSongForm(@PathVariable Long id, Model model) {
        Album album = albumRepo.findById(id)
                .orElseThrow(() -> new AlbumNotFoundException("Could not find album in db!"));
        model.addAttribute("album", album);
        return "add-song.html";
    }

    @PostMapping("/albums/{id}/addSong")
    public String addSong(@RequestParam Long albumId,@ModelAttribute Song song) {
        Album album = albumRepo.findById(albumId)
                .orElseThrow(() -> new AlbumNotFoundException("Could not find album for this song in db!"));
        song.setAlbum(album);
        songRepo.save(song);
        return "redirect:/albums/{id}";
}
}