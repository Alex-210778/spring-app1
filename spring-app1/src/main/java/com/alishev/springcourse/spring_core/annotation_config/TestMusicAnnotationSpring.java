package com.alishev.springcourse.spring_core.annotation_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusicAnnotationSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");

//        MusicAnnotation classicalMusic = context.getBean("classicalMusic", MusicAnnotation.class);
//        MusicAnnotation rockMusic = context.getBean("rockMusic", MusicAnnotation.class);
//
//        System.out.println(classicalMusic.getSong());
//        System.out.println(rockMusic.getSong());

//        MusicPlayerAnnotation player = context.getBean("musicPlayer", MusicPlayerAnnotation.class);
//
//        player.playMusic();

//        ComputerAnnotation computer = context.getBean("computer", ComputerAnnotation.class);
//
//        System.out.println(computer);

        MusicPlayerAnnotation player = context.getBean("musicPlayer", MusicPlayerAnnotation.class);

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        ClassicalMusicAnnotation classicalMusic1 = context.getBean("classicalMusic", ClassicalMusicAnnotation.class);

        System.out.println(classicalMusic1);

//        ClassicalMusicAnnotation classicalMusic2 = context.getBean("classicalMusic", ClassicalMusicAnnotation.class);
//
//        RockMusicAnnotation rockMusic1 = context.getBean("rockMusic", RockMusicAnnotation.class);
//        RockMusicAnnotation rockMusic2 = context.getBean("rockMusic", RockMusicAnnotation.class);
//
//        System.out.println("classicalMusic1 - " + classicalMusic1);
//        System.out.println("classicalMusic2 - " + classicalMusic2);
//        System.out.println(classicalMusic1 == classicalMusic2);
//
//        System.out.println("rockMusic1 - " + rockMusic1);
//        System.out.println("rockMusic2 - " + rockMusic2);
//        System.out.println(rockMusic1 == rockMusic2);

        context.close();
    }
}
