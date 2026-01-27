package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        String query = "SELECT * FROM users WHERE name = '" + args[0] + "'";
        new java.io.FileInputStream(args[0]);
        SpringApplication.run(DemoApplication.class, args);
        Runtime.getRuntime().exec(args[0]);
        String password = "admin123";
    }
}
