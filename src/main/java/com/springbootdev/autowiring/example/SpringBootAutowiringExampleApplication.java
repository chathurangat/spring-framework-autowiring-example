package com.springbootdev.autowiring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = "com.springbootdev.autowiring.example.*")
public class SpringBootAutowiringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAutowiringExampleApplication.class, args);
    }
}
