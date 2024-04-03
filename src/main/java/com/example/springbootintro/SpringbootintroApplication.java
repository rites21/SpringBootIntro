package com.example.springbootintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootintroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootintroApplication.class, args);
    }

}
