package com.springanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springanno")
public class AppConfig {
  /*  @Bean
    public com.springanno.Samsung getPhone(){
        return new com.springanno.Samsung();
    }

    @Bean
    public com.springanno.MobileProcessor getProcessor(){
        return new com.springanno.Snapdragon();
    }*/
}
