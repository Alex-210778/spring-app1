package com.alishev.springcourse.spring_core.music;

public class MusicPlayer {

    private Music music;

    private String name;
    private int volume;

    // Внедрение зависимостей с помощью конструктора
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    // Внедрение зависимостей с помощью сеттера
    public void setMusic(Music music) {
        this.music = music;
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

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
