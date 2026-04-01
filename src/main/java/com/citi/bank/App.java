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
        // Region-ah identify panna intha variable use aagum
        String region = System.getenv().getOrDefault("REGION_NAME", "Primary Cluster");

        return "<h1>Hello Anitha! 🎂 Citibank App is LIVE on AKS!</h1>" +
               "<h3>Current Region: <span style='color:blue;'>" + region + "</span></h3>" +
               "<p>Your 2.6 Years Cloud Engineer Journey is leveling up!</p>";
    }
}
