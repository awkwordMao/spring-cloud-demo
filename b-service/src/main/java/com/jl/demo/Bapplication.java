package com.jl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bapplication {
    public static void main(String[] args) {
        SpringApplication.run(Bapplication.class);
    }
}
