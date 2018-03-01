package com.liqihua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Run {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Run.class);
        app.run(args);
    }

}
