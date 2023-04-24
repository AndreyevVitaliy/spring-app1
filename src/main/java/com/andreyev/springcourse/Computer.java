package com.andreyev.springcourse;

import com.andreyev.springcourse.enums.EnumMusicGanres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public void setGanreToMusicPlayer(EnumMusicGanres ganres) {
        this.musicPlayer.setGanreMusic(ganres);
    }

    @Override
    public String toString() {
        return "Computer id = " + id +  " {" +
                "musicPlayer=" + musicPlayer.playMusic(musicPlayer.getGanreMusic()) +
                '}';
    }
}
