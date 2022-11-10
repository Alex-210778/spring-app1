package com.alishev.springcourse.spring_core.annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayerAnnotation {

    //Внедрение зависимости через поле
//    @Autowired
//    private MusicAnnotation music;

    //Внедрение зависимости через конструктор
//    @Autowired
//    public MusicPlayerAnnotation(MusicAnnotation music) {
//        this.music = music;
//    }

//    @Autowired
//    @Qualifier("classicalMusic")
//    private MusicAnnotation music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private MusicAnnotation music1;
    private MusicAnnotation music2;


//    public MusicPlayerAnnotation(MusicAnnotation music) {
//        this.music = music;
//    }


    @Autowired
    public MusicPlayerAnnotation(@Qualifier("classicalMusic") MusicAnnotation music1,
                                 @Qualifier("rockMusic") MusicAnnotation music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

    //Внедрение зависимости через сеттер
//    @Autowired
//    public void setMusic(MusicAnnotation music) {
//        this.music = music;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
