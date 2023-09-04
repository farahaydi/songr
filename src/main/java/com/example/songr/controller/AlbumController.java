package com.example.songr.controller;

import com.example.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String getAlbums(Model model) {
        Album[] albums = {
                new Album("Album 1", "Artist 1", 10, 3600, "image1.jpg"),
                new Album("Album 2", "Artist 2", 12, 4200, "image2.jpg"),
                new Album("Album 3", "Artist 3", 8, 3000, "image3.jpg")
        };
        model.addAttribute("albums", albums);
        return "Album";
    }
}
