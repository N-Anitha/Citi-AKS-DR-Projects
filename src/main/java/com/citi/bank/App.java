package com.citi.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<h1>Hello Anitha! 🎂 Citibank App is LIVE on AKS!</h1><p>Your 2.5 Years Cloud Engineer Journey Starts Now!</p>";
    }
}
