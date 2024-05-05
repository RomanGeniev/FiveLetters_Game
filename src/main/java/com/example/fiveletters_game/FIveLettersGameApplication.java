package com.example.fiveletters_game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FIveLettersGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(FIveLettersGameApplication.class, args);
    }

}
