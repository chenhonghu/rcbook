package com.yc.crbookuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class CrbookUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrbookUserApplication.class, args);
    }

}
