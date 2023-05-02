package com.andreyev.springcourse.ganres;

import com.andreyev.springcourse.interfaces.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private final List<String> listOfSongs = new ArrayList<>();

    //приватный конструктор не позволяет создать объект через ключевое слово new
    private ClassicalMusic() {
        listOfSongs.add("Классическая песня 1");
        listOfSongs.add("Классическая песня 2");
        listOfSongs.add("Классическая песня 3");
    }

    public static ClassicalMusic getNewClassicalMusic() { //фабричный метод
        //System.out.println("factory_method");
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        return listOfSongs;
    }

    @PostConstruct
    public void doInitMethod() {
        //System.out.println("Init");
    }

    @PreDestroy
    public void doDestroyMethod() {
        //System.out.println("Destroy");
    }
}
