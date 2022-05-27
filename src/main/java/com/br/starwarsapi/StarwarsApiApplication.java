package com.br.starwarsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class StarwarsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarwarsApiApplication.class, args);
    }

}
