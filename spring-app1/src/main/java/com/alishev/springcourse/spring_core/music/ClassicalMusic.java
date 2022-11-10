package com.alishev.springcourse.spring_core.music;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static ClassicalMusic getClassicalMusicByFabric() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my distraction");
    }
}
