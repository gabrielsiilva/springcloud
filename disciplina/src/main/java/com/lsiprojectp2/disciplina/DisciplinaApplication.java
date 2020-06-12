package com.lsiprojectp2.disciplina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DisciplinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisciplinaApplication.class, args);
    }

}
