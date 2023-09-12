package com.example.songr.controller;

import com.example.songr.exception.AlbumNotFoundException;
import com.example.songr.model.Album;
import com.example.songr.model.Song;
import com.example.songr.repositores.AlbumReopsitores;
import com.example.songr.repositores.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;
@Controller
public class SongsController {
    @Autowired
    AlbumReopsitores albumReopsitores;
    @Autowired
    SongRepository songRepository;
    @PostMapping("/add-songs")
    public RedirectView addSongs(String title, int length, int trackNumber, Long albumID)
    {
        Album aa= albumReopsitores
                .findById(albumID)
                .orElseThrow(() -> new AlbumNotFoundException("There is no id matching with this album"));

        Song ss= new Song(title,length,trackNumber,aa);
        songRepository.save(ss);
        return new RedirectView("/get-Songs");
    }
    @GetMapping("/get-Songs")
    public String getSongs(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "getSong";
    }


}
