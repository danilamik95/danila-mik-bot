package ru.deniil.joepeachbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DanilaMikBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DanilaMikBotApplication.class, args);
    }

}
