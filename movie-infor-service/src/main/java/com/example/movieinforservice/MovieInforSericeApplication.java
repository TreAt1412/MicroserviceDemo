package com.example.movieinforservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInforSericeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieInforSericeApplication.class, args);
    }

}
