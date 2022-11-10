package com.alishev.springcourse.spring_core.javacode_config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("classicalMusicCode")

public class ClassicalMusicJavaCode implements MusicJavaCode {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my distraction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
