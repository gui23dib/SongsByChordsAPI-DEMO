package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.Song;

@Service
public class SongService {
  public Optional<Song> getSong(Integer id) {
    Optional<Song> optional;
    optional = Optional.of(new Song("name", "artist", "album"));
    return optional;
  }
}
