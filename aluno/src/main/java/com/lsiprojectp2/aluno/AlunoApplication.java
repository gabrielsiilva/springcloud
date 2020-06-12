package com.lsiprojectp2.aluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AlunoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlunoApplication.class, args);
    }

}
