package com.alishev.springcourse.spring_core.music;

import java.util.ArrayList;
import java.util.List;

public class HomeMusicPlayers {
    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void playMusic() {
        for (Music music : musicList) {
            if (music != null) {
                System.out.println("Playing: " + music.getSong());
            }
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
