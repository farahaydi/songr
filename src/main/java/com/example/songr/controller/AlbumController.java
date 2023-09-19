package com.example.songr.controller;

import com.example.songr.exception.AlbumNotFoundException;
import com.example.songr.model.Album;
import com.example.songr.repositores.AlbumReopsitores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumReopsitores albumJpa;

    @GetMapping("/albums")
    public String getAlbums(Model model) {
        List<Album> albums = albumJpa.findAll();
        model.addAttribute("albums", albums);
        return "albums.html";
    }

    @PostMapping("/create-album")
    public RedirectView createAlbum(String albumTitle, String artist, int songCount, int length, String imageUrl,Model model) {
        Album newAlbum = new Album(albumTitle, artist, songCount, length, imageUrl);
        albumJpa.save(newAlbum);
        model.addAttribute("album", newAlbum);
        return new RedirectView("/albums");

    }
    @GetMapping("/albums/{id}")
    public String viewAlbum(@PathVariable Long id, Model model) {
        Album album = albumJpa.findById(id)
                .orElseThrow(() -> new AlbumNotFoundException("Could not find album for this song in db!"));
        model.addAttribute("album", album);
        return "album-details.html";
}
}