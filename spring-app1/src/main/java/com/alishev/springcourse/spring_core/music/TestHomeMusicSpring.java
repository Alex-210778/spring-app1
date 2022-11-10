package com.alishev.springcourse.spring_core.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHomeMusicSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextHome.xml");

        HomeMusicPlayers musicPlayer = context.getBean("musicPlayer", HomeMusicPlayers.class);

        musicPlayer.playMusic();


        context.close();
    }
}
