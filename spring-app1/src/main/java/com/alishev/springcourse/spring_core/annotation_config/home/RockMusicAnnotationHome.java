package com.alishev.springcourse.spring_core.annotation_config.home;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusicHome")
public class RockMusicAnnotationHome implements MusicAnnotationHome {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Rock music 1");
        songs.add("Rock music 2");
        songs.add("Rock music 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
