package com.example.cloudserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigServer

public class CloudServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudServerApplication.class, args);
    }


}
