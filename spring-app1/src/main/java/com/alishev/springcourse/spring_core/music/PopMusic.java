package com.alishev.springcourse.spring_core.music;

public class PopMusic implements Music{

    @Override
    public String getSong() {
        return "Yellow Submarine";
    }

    @Override
    public String toString() {
        return "PopMusic{}";
    }
}
