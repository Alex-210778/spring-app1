package com.alishev.springcourse.spring_core.javacode_config.home;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class SpringConfigHome {

    @Bean
    public ClassicalMusicJavaCodeHome classicalMusicHome() {
        return new ClassicalMusicJavaCodeHome();
    }

    @Bean
    public RockMusicJavaCodeHome rockMusicHome() {
        return new RockMusicJavaCodeHome();
    }

    @Bean
    public PopMusicJavaCodeHome popMusicHome() {
        return new PopMusicJavaCodeHome();
    }

    @Bean()
    public List<MusicJavaCodeHome> listMusic() {
        List<MusicJavaCodeHome> listMusic = new ArrayList<>();
        listMusic.add(classicalMusicHome());
        listMusic.add(rockMusicHome());
        listMusic.add(popMusicHome());
        return listMusic;
    }

    @Bean
    public MusicPlayerJavaCodeHome musicPlayer() {
        return new MusicPlayerJavaCodeHome(listMusic());
    }

}
