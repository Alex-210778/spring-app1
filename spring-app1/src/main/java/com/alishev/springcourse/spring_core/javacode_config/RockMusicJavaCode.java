package com.alishev.springcourse.spring_core.javacode_config;

import com.alishev.springcourse.spring_core.annotation_config.MusicAnnotation;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component("rockMusicCode")
//@Scope("prototype")
@Order
public class RockMusicJavaCode implements MusicJavaCode {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }


}
