package com.example;

public class Main {
	    public static void main(java.lang.String[] args) {
	        MusicPlaylist playlist = new MusicPlaylist();

	        playlist.addSong("Song 1");
	        playlist.addSong("Song 2");
	        playlist.addSong("Song 3");
	        playlist.addSong("Song 4");
	        playlist.addSong("Song 5");

	        playlist.displayPlaylist();

	        playlist.removeSong("Song 3");

	        playlist.displayPlaylist();

	        playlist.moveSong("Song 2", 4);

	        playlist.displayPlaylist();
	    }
	}
