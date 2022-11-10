package com.alishev.springcourse.spring_core.javacode_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.alishev.springcourse.spring_core.javacode_config")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusicJavaCode classicalMusic() {
        return new ClassicalMusicJavaCode();
    }

    @Bean
    public RockMusicJavaCode rockMusic() {
        return new RockMusicJavaCode();
    }

    @Bean
    public MusicPlayerJavaCode musicPlayer() {
        return new MusicPlayerJavaCode(rockMusic(), classicalMusic());
    }

}
