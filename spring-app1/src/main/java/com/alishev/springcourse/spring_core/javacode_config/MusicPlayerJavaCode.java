package com.alishev.springcourse.spring_core.javacode_config;

import com.alishev.springcourse.spring_core.annotation_config.MusicAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("musicPlayerCode")
public class MusicPlayerJavaCode {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private MusicJavaCode music1;
    private MusicJavaCode music2;

    @Autowired()
    public MusicPlayerJavaCode(MusicJavaCode music1,
                               MusicJavaCode music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

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
