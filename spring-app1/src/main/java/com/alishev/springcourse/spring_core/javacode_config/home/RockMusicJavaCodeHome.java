package com.alishev.springcourse.spring_core.javacode_config.home;

public class RockMusicJavaCodeHome implements MusicJavaCodeHome {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return "RockMusicJavaCodeHome{}";
    }
}
