package com.springanno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
    public void process() {
        System.out.println("Best CPU SNAPDRAGON");
    }
}
