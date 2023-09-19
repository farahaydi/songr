package com.example.songr.repositores;

import com.example.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumReopsitores extends JpaRepository<Album,Long> {
}
