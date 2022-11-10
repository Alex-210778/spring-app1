package com.alishev.springcourse.spring_core.javacode_config.home;

public class ClassicalMusicJavaCodeHome implements MusicJavaCodeHome {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String toString() {
        return "ClassicalMusicJavaCodeHome{}";
    }
}
