package com.arohau.proxy.ex2;

import static java.util.Objects.nonNull;

public class MediaPlayerProxy implements MediaPlayer {

    private final MediaPlayer movieMediaPlayer;
    private final AuthorityValidator authorityValidator;

    public MediaPlayerProxy(MediaPlayer movieMediaPlayer, AuthorityValidator authorityValidator) {
        this.movieMediaPlayer = movieMediaPlayer;
        this.authorityValidator = authorityValidator;
    }

    @Override
    public void playMedia(String mediaSource) {
        if (nonNull(mediaSource) && authorityValidator.checkUserAccessToSource(mediaSource)) {
            movieMediaPlayer.playMedia(mediaSource);
        } else {
            System.out.println("Media source does not exist, or you have not enough rights to watch it.");
        }
    }
}
