package com.alishev.springcourse.spring_core.annotation_config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicalMusic")
@Scope("prototype")
public class ClassicalMusicAnnotation implements MusicAnnotation {

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
