package com.codesegment.api.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication


@EntityScan(basePackages = {"com.codesegment.api.base.entity"})
@EnableJpaRepositories(basePackages = {"com.codesegment.api.base.repository"})
public class ApiBaseApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiBaseApplication.class, args);
    }
}
