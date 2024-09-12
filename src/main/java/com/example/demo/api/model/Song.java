package com.example.demo.api.model;

import java.util.Arrays;

/**
 *
 * @author Gui23
 */
public class Song {
  private int id;
  public String name;
  public String artist;
  public String album;
  // public String[] genre;
  // public String[] tags;
  public String[] lyrics;
  public ChordConfig[] chords;
  
  public Song(String name, String artist, String album) {
    this.name = name;
    this.artist = artist;
    this.album = album;
  }

  //#region Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String[] getLyrics() {
    return lyrics;
  }

  public void setLyrics(String[] lyrics) {
    this.lyrics = lyrics;
  }

  public ChordConfig[] getChords() {
    return chords;
  }

  public void setChords(ChordConfig[] chords) {
    this.chords = chords;
  }
  //#endregion

  @Override
  public String toString() {
    return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", album=" + album + ", lyrics="
        + Arrays.toString(lyrics) + ", chords=" + Arrays.toString(chords) + "]";
  }

  
}
