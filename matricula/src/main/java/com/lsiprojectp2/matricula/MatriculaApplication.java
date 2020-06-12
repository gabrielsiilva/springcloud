package com.lsiprojectp2.matricula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MatriculaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatriculaApplication.class, args);
    }

}
