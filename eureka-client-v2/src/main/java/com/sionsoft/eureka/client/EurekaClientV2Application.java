package com.sionsoft.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientV2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientV2Application.class, args);
    }

}
