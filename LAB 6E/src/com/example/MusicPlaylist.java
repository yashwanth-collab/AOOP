package com.example;

public class MusicPlaylist {
	    private java.util.LinkedList<java.lang.String> playlist;

	    public MusicPlaylist() {
	        this.playlist = new java.util.LinkedList<>();
	    }

	    public void addSong(java.lang.String song) {
	        playlist.add(song);
	        System.out.println("Song added: " + song);
	    }

	    public void removeSong(java.lang.String song) {
	        if (playlist.contains(song)) {
	            playlist.remove(song);
	            System.out.println("Song removed: " + song);
	        } else {
	            System.out.println("Song not found in the playlist.");
	        }
	    }

	    public void moveSong(java.lang.String song, int position) {
	        if (playlist.contains(song)) {
	            playlist.remove(song);
	            if (position < 0 || position > playlist.size()) {
	                System.out.println("Invalid position.");
	                return;
	            }
	            playlist.add(position, song);
	            System.out.println("Song moved to position " + position + ": " + song);
	        } else {
	            System.out.println("Song not found in the playlist.");
	        }
	    }

	    public void displayPlaylist() {
	        if (playlist.isEmpty()) {
	            System.out.println("Playlist is empty.");
	            return;
	        }
	        System.out.println("Playlist:");
	        for (java.lang.String song : playlist) {
	            System.out.println(song);
	        }
	    }
	}