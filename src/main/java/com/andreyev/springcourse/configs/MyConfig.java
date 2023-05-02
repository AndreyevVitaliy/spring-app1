package com.andreyev.springcourse.configs;

import com.andreyev.springcourse.*;
import com.andreyev.springcourse.ganres.ClassicalMusic;
import com.andreyev.springcourse.ganres.RapMusic;
import com.andreyev.springcourse.ganres.RockMusic;
import com.andreyev.springcourse.interfaces.Music;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.andreyev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class MyConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return ClassicalMusic.getNewClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return RockMusic.getNewRockMusic();
    }



    @Bean
    public List<Music> playList(){
        List<Music> tempPlayList = new ArrayList<>();
        tempPlayList.add(rockMusic());
        tempPlayList.add(classicalMusic());
        tempPlayList.add(rapMusic());

        return tempPlayList;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return MusicPlayer.getNewMusicPlayer(playList());
    }

    @Bean
    public RapMusic rapMusic(){
        return RapMusic.getNewRapMusic();
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
