package com.andreyev.springcourse.ganres;

import com.andreyev.springcourse.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {

    private final List<String> listOfSongs = new ArrayList<>();

    private RapMusic(){
        listOfSongs.add("RAP song 1");
        listOfSongs.add("RAP song 2");
        listOfSongs.add("RAP song 3");
    }

    public static RapMusic getNewRapMusic(){
        return new RapMusic();
    }


    @Override
    public List<String> getSong() {
        return listOfSongs;
    }

}
