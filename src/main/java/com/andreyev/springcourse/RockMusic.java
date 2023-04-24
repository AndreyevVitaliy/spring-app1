package com.andreyev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> listOfSongs = new ArrayList<>();

    public RockMusic() {
        listOfSongs.add("Рок песня 1");
        listOfSongs.add("Рок песня 2");
        listOfSongs.add("Рок песня 3");
    }

    @Override
    public List<String> getSong() {
        return listOfSongs;
    }
}
