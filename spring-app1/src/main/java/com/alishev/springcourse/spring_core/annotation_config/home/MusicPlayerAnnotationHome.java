package com.alishev.springcourse.spring_core.annotation_config.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("musicPlayerHome")
public class MusicPlayerAnnotationHome {

    private ClassicalMusicAnnotationHome classicalMusic;
    private RockMusicAnnotationHome rockMusic;

    @Autowired
    public MusicPlayerAnnotationHome(@Qualifier("classicalMusicHome") ClassicalMusicAnnotationHome classicalMusic,
                                     @Qualifier("rockMusicHome") RockMusicAnnotationHome rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomIndex = Math.abs(random.nextInt(3));

        if (genre.equals(MusicGenre.ROCK)) {
            System.out.println(rockMusic.getSongs().get(random.nextInt(randomIndex + 1)));
        } else {
            System.out.println(classicalMusic.getSongs().get(random.nextInt(randomIndex + 1)));
        }
    }
}
