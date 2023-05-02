package com.andreyev.springcourse;

import com.andreyev.springcourse.enums.EnumMusicGanres;
import com.andreyev.springcourse.interfaces.Music;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music>listMusic;

    private EnumMusicGanres ganreMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    //IoC

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }


    public static MusicPlayer getNewMusicPlayer(List<Music> listMusic){
        return new MusicPlayer(listMusic);
    }


    public void setGanreMusic(EnumMusicGanres ganreMusic) {
        this.ganreMusic = ganreMusic;
    }

    public EnumMusicGanres getGanreMusic() {
        return ganreMusic;
    }

    public String playMusic(EnumMusicGanres ganres) {

        Music tempMusic;

        switch (ganres){
            case ROCK:
                return getRandomSong(listMusic.get(0).getSong());
            case CLASSICAL:
                return getRandomSong(listMusic.get(1).getSong());
            case RAP:
                return getRandomSong(listMusic.get(2).getSong());
            default:
                return "Out";
        }

    }

    private String getRandomSong(List<String> array){

        int upperbound = 3;
        Random rand = new Random();
        int tempValue = rand.nextInt(upperbound);

        return array.get(tempValue);

    }

    public List<Music> getListMusic() {
        return listMusic;
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
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
