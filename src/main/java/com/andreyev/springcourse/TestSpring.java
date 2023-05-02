package com.andreyev.springcourse;

import com.andreyev.springcourse.configs.MyConfig;
import com.andreyev.springcourse.enums.EnumMusicGanres;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        Random random = new Random();
        int tempValue = random.nextInt(computer.getMusicPlayer().getListMusic().size());

        switch (tempValue) {
            case 0:
                computer.setGanreToMusicPlayer(EnumMusicGanres.ROCK);
                break;
            case 1:
                computer.setGanreToMusicPlayer(EnumMusicGanres.CLASSICAL);
                break;
            case 2:
                computer.setGanreToMusicPlayer(EnumMusicGanres.RAP);
                break;
        }

        System.out.println(computer);

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        Music rapMusic = context.getBean("rapMusic", Music.class);
//        Music rockMusic = context.getBean("rockMusic", Music.class);

//        musicPlayer.addMusicToMusicList(classicalMusic);
//        musicPlayer.addMusicToMusicList(rapMusic);
//        musicPlayer.addMusicToMusicList(rockMusic);

//        musicPlayer.playMusicList();

        //musicPlayer.playMusic();

        context.close();

    }
}
