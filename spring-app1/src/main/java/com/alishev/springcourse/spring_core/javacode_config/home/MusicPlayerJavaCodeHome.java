package com.alishev.springcourse.spring_core.javacode_config.home;

import com.alishev.springcourse.spring_core.annotation_config.home.MusicGenre;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayerJavaCodeHome {

    private List<MusicJavaCodeHome> musicList = new ArrayList<>();

    public MusicPlayerJavaCodeHome(List<MusicJavaCodeHome> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        int randomIndex = Math.abs(random.nextInt(musicList.size()));

        return "Playing: " + musicList.get(randomIndex).getSong();
    }

    public List<MusicJavaCodeHome> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<MusicJavaCodeHome> musicList) {
        this.musicList = musicList;
    }

    @Override
    public String toString() {
        return "MusicPlayerJavaCodeHome{" +
                "musicList=" + musicList +
                '}';
    }
}
