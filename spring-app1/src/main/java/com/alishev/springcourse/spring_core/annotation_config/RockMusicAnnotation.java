package com.alishev.springcourse.spring_core.annotation_config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockMusic")
@Scope("prototype")
public class RockMusicAnnotation implements MusicAnnotation {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }


}
