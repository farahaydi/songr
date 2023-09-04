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
                new Album("Clouds", "Fin Argus & Sabrina Carpenter", 5, 3600, "https://www.indiewire.com/wp-content/uploads/2020/10/clouds-disney-plus.jpg?w=1277&h=769&crop=1"),
                new Album("Runaway", "AURORA", 12, 4200, "https://upload.wikimedia.org/wikipedia/en/7/77/Aurora_-_Runaway.png"),
                new Album("HeartBreak", "Giveon", 8, 3000, "https://upload.wikimedia.org/wikipedia/en/2/2a/Giveon_-_Heartbreak_Anniversary.png")
        };
        model.addAttribute("albums", albums);
        return "allbumee.html";
    }
}
