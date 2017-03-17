package com.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        //ApplicationContext need to know the configure class
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        //specify Bean method
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
