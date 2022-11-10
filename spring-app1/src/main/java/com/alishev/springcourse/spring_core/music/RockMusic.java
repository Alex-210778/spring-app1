package com.alishev.springcourse.spring_core.music;

public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return "RockMusic{}";
    }
}
