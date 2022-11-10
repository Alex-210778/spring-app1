package com.alishev.springcourse.spring_core;

import com.alishev.springcourse.spring_core.music.Music;
import com.alishev.springcourse.spring_core.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

        Music musicBean = context.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(musicBean);
        player.playMusic();

        context.close();
    }
}
