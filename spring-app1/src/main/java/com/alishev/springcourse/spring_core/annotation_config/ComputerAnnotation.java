package com.alishev.springcourse.spring_core.annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computer")
public class ComputerAnnotation {
    private int id;
    private MusicPlayerAnnotation musicPlayer;

    @Autowired
    public ComputerAnnotation(MusicPlayerAnnotation musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "ComputerAnnotation{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer +
                '}';
    }
}
