package com.andreyev.springcourse.ganres;

import com.andreyev.springcourse.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    private List<String> listOfSongs = new ArrayList<>();

    public static RockMusic getNewRockMusic() {
        return new RockMusic();
    }

    private RockMusic() {
        listOfSongs.add("Рок песня 1");
        listOfSongs.add("Рок песня 2");
        listOfSongs.add("Рок песня 3");
    }

    @Override
    public List<String> getSong() {
        return listOfSongs;
    }
}
