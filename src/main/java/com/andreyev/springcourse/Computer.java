package com.andreyev.springcourse;

import com.andreyev.springcourse.enums.EnumMusicGanres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public void setGanreToMusicPlayer(EnumMusicGanres ganres) {
        this.musicPlayer.setGanreMusic(ganres);
    }

    @Override
    public String toString() {
        EnumMusicGanres ganres = musicPlayer.getGanreMusic();

        return "Computer id = " + id +  "\n" + "{\n" +
                "musicPlayer = " + musicPlayer.playMusic(ganres) + "\n" +
                "musicGanre = " + ganres + "\n" +
                "musicPlayerName = " + musicPlayer.getName() + "\n" +
                "musicPlayerVolume = " + musicPlayer.getVolume() +  "\n" +
                '}';
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }
}
