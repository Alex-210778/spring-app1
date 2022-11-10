package com.alishev.springcourse.spring_core.javacode_config.home;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestMusicJavaCodeHomeSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfigHome.class
        );

        MusicPlayerJavaCodeHome musicPlayer = context.getBean(MusicPlayerJavaCodeHome.class);


        List<MusicJavaCodeHome> musicList = musicPlayer.getMusicList();
        for (MusicJavaCodeHome musicJavaCodeHome : musicList) {
            System.out.println(musicJavaCodeHome.getSong());
        }

        System.out.println(musicPlayer.playMusic().toString());




        context.close();
    }
}
