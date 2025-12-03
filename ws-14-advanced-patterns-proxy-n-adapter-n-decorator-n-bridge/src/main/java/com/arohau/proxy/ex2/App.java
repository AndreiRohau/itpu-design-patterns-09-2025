package com.arohau.proxy.ex2;

/*
    proxy

    - add lazy load for the data

 */
public class App {

    public static void main(String[] args) {
        AuthorityValidator authorityValidator = new AuthorityValidator();
        MediaPlayer mediaPlayer = new MovieMediaPlayer();
        MediaPlayer proxy = new MediaPlayerProxy(mediaPlayer, authorityValidator);

        String mediaSourcePublic = "/video/720/public/some_video_file.mp4";
        String mediaSourcePrime = "/video/720/prime/some_video_file.mp4";

        proxy.playMedia(mediaSourcePublic);
        System.out.println();
        proxy.playMedia(mediaSourcePrime);
    }
}
