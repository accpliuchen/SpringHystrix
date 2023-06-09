package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
public class SpringHystrixServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHystrixServiceApplication.class, args);
    }
}