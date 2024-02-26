package com.app.gymanagement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
        title = "GYM Management App Rest APIs",
        description = "GYM Management App Rest APIs Documentation",
        version = "v1.0"
		)
)
public class GymanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymanagementApplication.class, args);
    }

}
