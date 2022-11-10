package com.alishev.springcourse.spring_core.javacode_config;

import com.alishev.springcourse.spring_core.annotation_config.ClassicalMusicAnnotation;
import com.alishev.springcourse.spring_core.annotation_config.MusicPlayerAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

public class TestMusicJavaCodeSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        ClassicalMusicJavaCode classicalMusic = context.getBean("classicalMusic", ClassicalMusicJavaCode.class);
        System.out.println(classicalMusic.getSong());

        MusicPlayerJavaCode musicPlayer = context.getBean("musicPlayer", MusicPlayerJavaCode.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
