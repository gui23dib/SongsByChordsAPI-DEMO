package com.example.demo.api.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.model.Song;
import com.example.demo.service.SongService;


@RestController
public class SongController {

  private final SongService songService;

  public SongController(SongService songService) {
    this.songService = songService;
  }

  @GetMapping("/song")
  public Song getSong(@RequestParam Integer id) {
    Optional<Song> song = songService.getSong(id);
    if (song.isPresent()) {
      return (Song) song.get();
    }
    return null;
  }

  // @GetMapping("/song")
  // public Song getAllSongs() {
  //   Optional<Song> song = songService.getSong(0);
  //   if (song.isPresent()) {
  //     return (Song) song.get();
  //   }
  //   return null;
  // }
}
