package com.andreyev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private final List<String> listOfSongs = new ArrayList<>();

    //приватный конструктор не позволяет создать объект через ключевое слово new
    private ClassicalMusic() {
        listOfSongs.add("Классическая песня 1");
        listOfSongs.add("Классическая песня 2");
        listOfSongs.add("Классическая песня 3");
    }

    public static ClassicalMusic getClassicalMusic() { //фабричный метод
        System.out.println("factory_method");
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        return listOfSongs;
    }

    public void doInitMethod(){
        System.out.println("Init");
    }

    public void doDestroyMethod(){
        System.out.println("Destroy");
    }
}
