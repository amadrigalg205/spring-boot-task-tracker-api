package com.salud360.demo.tasktracker.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Task Tracker API")
                        .version("1.0.0")
                        .description("RESTful API for managing tasks. This API allows you to create, list, and complete tasks.")
                        .contact(new Contact()
                                .name("Salud360 Demo")
                                .email("info@salud360.cr")
                                .url("https://www.salud360.cr"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));

    }
}


