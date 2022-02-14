package com.example.simplecrud_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimpleCrudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleCrudEurekaApplication.class, args);
    }

}
