package com.andreyev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayer1 == musicPlayer2;

        musicPlayer1.setVolume(10);
        musicPlayer2.setVolume(80);

        System.out.println("One Object? " + comparison);

        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
        //System.out.println(musicPlayer2.getName());


        context.close();

    }
}
