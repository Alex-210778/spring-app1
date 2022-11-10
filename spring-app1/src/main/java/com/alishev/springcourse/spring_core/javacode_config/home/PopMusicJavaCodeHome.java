package com.alishev.springcourse.spring_core.javacode_config.home;

public class PopMusicJavaCodeHome implements MusicJavaCodeHome {

    @Override
    public String getSong() {
        return "Yellow submarine";
    }

    @Override
    public String toString() {
        return "PopMusicJavaCodeHome{}";
    }
}
