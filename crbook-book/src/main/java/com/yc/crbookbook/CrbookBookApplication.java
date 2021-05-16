package com.yc.crbookbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CrbookBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrbookBookApplication.class, args);
    }

}
