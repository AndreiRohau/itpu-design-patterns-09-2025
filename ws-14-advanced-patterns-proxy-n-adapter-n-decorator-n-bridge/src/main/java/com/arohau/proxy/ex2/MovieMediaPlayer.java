package com.arohau.proxy.ex2;

public class MovieMediaPlayer implements MediaPlayer {

    @Override
    public void playMedia(String mediaSource) {
        System.out.println("Loading up video from source: " + mediaSource);
        System.out.println("Playing video from source: " + mediaSource);
    }
}
