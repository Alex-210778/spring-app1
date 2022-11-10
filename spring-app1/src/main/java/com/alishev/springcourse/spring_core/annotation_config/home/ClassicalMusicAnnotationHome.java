package com.alishev.springcourse.spring_core.annotation_config.home;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicalMusicHome")
public class ClassicalMusicAnnotationHome implements MusicAnnotationHome {
    List<String> songs = new ArrayList<>();
    {
        songs.add("Classic music 1");
        songs.add("Classic music 2");
        songs.add("Classic music 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "ClassicalMusicAnnotation{}";
    }
}
