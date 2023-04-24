package com.andreyev.springcourse;

import com.andreyev.springcourse.enums.EnumMusicGanres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;
    private EnumMusicGanres ganreMusic;

    private String name;
    private int volume;

    //IoC
    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public MusicPlayer() {
    }

    public void setGanreMusic(EnumMusicGanres ganreMusic) {
        this.ganreMusic = ganreMusic;
    }

    public EnumMusicGanres getGanreMusic() {
        return ganreMusic;
    }

    public String playMusic(EnumMusicGanres ganres) {
        switch (ganres){
            case ROCK:
                return getRandomSong(rockMusic.getSong());
            case CLASSICAL:
                return getRandomSong(classicalMusic.getSong());
            default:
                return "выключен";
        }
//        return "Playing: " + music.getSong();
    }

    private String getRandomSong(List<String> array){

        int upperbound = 3;
        Random rand = new Random();
        int tempValue = rand.nextInt(upperbound);

        return array.get(tempValue);

    }


//    @Autowired
////    @Qualifier("rapMusic")
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
