package com.example.hibernate1springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Hibernate1SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate1SpringbootApplication.class, args);

    }
    @Bean
    public CommandLineRunner commandLineRunner (String []args){
        return runner->{
            System.out.println("hello");
        };
    }

}
