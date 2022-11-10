package com.alishev.springcourse.spring_core.annotation_config.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusicAnnotationHomeSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        MusicPlayerAnnotationHome musicPlayer = context.getBean("musicPlayerHome", MusicPlayerAnnotationHome.class);

        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.CLASSICAL);

        context.close();
    }
}
