package com.example.songr.repositores;

import com.example.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongrReopsitores extends JpaRepository<Album,Long> {
}
