package com.aniket.SpringBootDemo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop object created...");
    }
    @Override
    @Primary
    public void compile() {
        System.out.println("Desktop Compiling...");
    }
}
