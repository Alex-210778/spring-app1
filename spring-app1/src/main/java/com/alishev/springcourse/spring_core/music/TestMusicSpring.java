package com.alishev.springcourse.spring_core.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusicSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(player == player1);

//        System.out.println("player - " + player);
//        System.out.println("player1 - " + player1);
//
//        player.playMusic();
//
//        System.out.println("Name: " + player.getName());
//        System.out.println("Volume: " + player.getVolume());
//
//        player.setVolume(100);
//
//        System.out.println("Volume player1 - " + player1.getVolume());
//
//
//        System.out.println("Name: " + player.getName());
//        System.out.println("Volume: " + player.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println("music: " + classicalMusic);
        System.out.println(classicalMusic.getSong());
        System.out.println("_____________________");

        System.out.println("music1: " + classicalMusic1);
        System.out.println(classicalMusic1.getSong());

        context.close();
    }
}
